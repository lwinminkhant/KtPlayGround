package classesandobjects

import algorithm.addArrays


/**
 * @created 07/03/2023 - 11:20 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 3/7/23
 */
class Delegation {

}
interface SoundBehavior {
    fun makeSound()
    
}

class ScreamBehavior(val x: String) : SoundBehavior {
    override fun makeSound() { println("scram: $x") }
    
}

class Animal(b: SoundBehavior) : SoundBehavior by b{
    override fun makeSound() { println("meow") }
}

fun main() {
    val b = ScreamBehavior("Roar")
    b.makeSound()

    Animal(b).makeSound()
}