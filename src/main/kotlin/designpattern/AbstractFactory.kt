package designpattern

import java.lang.Exception


/**
 * @created 11/12/2022 - 10:42 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/11/22
 *
 * USAGE
 * To support families of related or dependent objects
 * To encapsulate platform dependencies to make a application portable
 * To prevent client code form using the new operator
 * To easy swap the underlying platform with minimal changes
 *
 * INTENT
 * Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
 *
 * COMPONENTS
 * An Abstract Factory class (public)
 * Factory Implementation for various families (protected)
 * Interfaces for various products (public)
 * Set of product implementations for various families (protected)
 */

abstract class Factory {
    companion object {
        var carFactory: Factory? = null
        var truckFactory: Factory? = null

        fun getFactory(vehicleType: String): Factory? {
            val factory: Factory?
            when (vehicleType) {
                "car" -> {
                    if (carFactory == null)
                        carFactory = CarFactory()

                    factory = carFactory
                }
                "truck" -> {
                    if (truckFactory == null) {
                        truckFactory = TruckFactory()
                    }
                    factory = truckFactory
                }
                else -> throw UnknownVehicleException()
            }
            return factory
        }
    }

    abstract fun getEngine(): Engine
    abstract fun getTyre(): Tyre


}

class UnknownVehicleException : Exception() {

}

interface Engine {
    fun design()
    fun manufacture()
    fun test()
}

interface Tyre {
    fun design()
    fun manufacture()
}

class CarEngine : Engine {
    override fun design() {
        print("Designing Car Engine")
    }

    override fun manufacture() {
        print("Manufacturing Car Engine")
    }

    override fun test() {
        print("Testing car engine")
    }
}


class CarTyre : Tyre {
    override fun design() {
        print("Designing car tyre")
    }

    override fun manufacture() {
        print("Manufacturing car tyre")
    }
}

class TruckEngine : Engine {
    override fun design() {
        print("Designing Truck Engine")
    }

    override fun manufacture() {
        print("Manufacturing Truck Engine")
    }

    override fun test() {
        print("Testing Truck Engine")
    }
}

class TruckTyre : Tyre {
    override fun design() {
        print("designing truck tyre")
    }

    override fun manufacture() {
        print("manufacturing truck tyre")
    }
}

class CarFactory : Factory() {
    override fun getEngine(): Engine {
        return CarEngine()
    }

    override fun getTyre(): Tyre {
        return CarTyre()
    }
}

class TruckFactory : Factory() {
    override fun getEngine(): Engine {
        return TruckEngine()
    }

    override fun getTyre(): Tyre {
        return TruckTyre()
    }
}

fun main() {

    val factory = Factory.getFactory("truck")
    val engine = factory?.getEngine()
    engine?.let {
        it.design()
        it.manufacture()
        it.test()
    }
    val tyre = factory?.getTyre()
    tyre?.let {
        it.design()
        it.manufacture()
    }

}
