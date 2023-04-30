package basic

import kotlin.Array


/**
 * @created 20/10/2022 - 12:30 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/20/22
 */

fun main() {
    val a : Array<Int> = arrayOf(1, 2, 3, 4, 5 )
    passObject(a)
    passInt(33)
    print(a.asList())
}
fun passInt(num: Int){
    //num = num+3
    print(num)
}
fun passObject(array: Array<Int>){
    array[0] = 9999
    print(array.asList())
}