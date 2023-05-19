package function

import java.util.concurrent.atomic.AtomicInteger


/**
 * @created 14/05/2023 - 5:47 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 5/14/23
 */
class PassByValue {


}

fun main() {
    val number = AtomicInteger(1)
    val numbers = mutableListOf(1,2)

    fun change(int: Int){
        //function args are val
        //int = 2
    }
    fun change(atomicInteger: AtomicInteger){
        atomicInteger.set(3)
    }
    fun change(list: MutableList<Int>){
        list.add(3)
    }
    println(number)
    println(numbers)

    change(numbers)
    change(number)

    println(number)
    println(numbers)
}