package designpattern


/**
 * @created 02/01/2023 - 9:29 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 1/2/23
 */
class Decorator {
}

interface Piz{
    fun prepare()
}

class Pizza : Piz{
    override fun prepare() {
        print("Pizza")
    }
}

abstract class PizzaDecorator(item: Piz): Piz{
    val pizza: Piz = item
    override fun prepare() {
        pizza.prepare()
    }
}

class DeepFried(item: Piz): PizzaDecorator(item) {
    override fun prepare() {
        super.prepare()
        print("+ Deep Fried")
    }
}

class DoubleCheese(item: Piz) :PizzaDecorator(item){
    override fun prepare() {
        super.prepare()
        print("+ Double Cheese")
    }
}

class Spicy(item: Piz) : PizzaDecorator(item){
    override fun prepare() {
        super.prepare()
        print("+ Spicy")
    }
}

fun main() {
    DeepFried(Spicy(DoubleCheese(Pizza()))).prepare()
}

