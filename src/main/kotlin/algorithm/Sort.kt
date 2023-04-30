package algorithm

import kotlin.Array


/**
 * @created 21/10/2022 - 1:32 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/21/22
 */
class Sort {
}

fun main() {
    val arr = arrayOf(0, 1, 2, 4, 6, 5, 3)
    val length = arr.size
    println("mid : %d".format(findMedium(arr)))

}
fun findMedium(array: Array<Int>): Int{
    array.sort()
    return array[array.size/2]
}