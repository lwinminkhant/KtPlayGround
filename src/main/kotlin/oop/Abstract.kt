package oop


/**
 * @created 16/04/2023 - 9:52 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 4/16/23
 */
abstract class Abstract {
}
abstract class Animal(val name: String) {
    abstract fun makeSound()
    fun printName(){
        print("$name: ")
    }

}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        printName()
        println("Woof!")
    }
}

class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        printName()
        println("Meow!")
    }
}

fun main() {
    //handleResult(Error(java.lang.Exception("Missing animal")))
    getRandomAnimal().makeSound()
}


//get random animal
fun getRandomAnimal(): Animal {
    val classes = arrayOf(Dog::class.java, Cat::class.java)
    val randomIndex = (0..1).random()
    val randomClass = classes[randomIndex]
    return randomClass.getConstructor(String::class.java).newInstance("Random Animal")
}
