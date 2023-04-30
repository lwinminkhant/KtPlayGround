package designpattern


/**
 * @created 02/01/2023 - 9:06 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 1/2/23
 */
class Bridge {

}
interface Color{
    fun applyColor()
}

class Red : Color{
    override fun applyColor() {
        print("Red")
    }
}
class Blue : Color{
    override fun applyColor() {
        print("Blue")
    }
}
class Green : Color{
    override fun applyColor() {
        print("Green")
    }
}

abstract class Car(val color: Color){
    abstract fun build()
}

class SportCar(color: Color) : Car(color) {
    override fun build() {
        print("Sport car with")
        color.applyColor()
    }
}
class TuckCar(color: Color):Car(color){
    override fun build() {
        print("Truck car with")
        color.applyColor()
    }
}
class OffRoadCar(color: Color):Car(color){
    override fun build() {
        print("OffRoad car with")
        color.applyColor()
    }
}
fun main() {
    SportCar(Red()).build()
    TuckCar(Green()).build()
    OffRoadCar(Red()).build()
}