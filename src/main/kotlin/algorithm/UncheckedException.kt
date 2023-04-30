package algorithm

import java.lang.NumberFormatException


/**
 * @created 04/11/2022 - 11:15 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/4/22
 */

/**
 * There's no checked exception in kotlin*/
class UncheckedException {
    val arg = "a"
    val price = try {
        arg.toInt()
    }catch (e: NumberFormatException){
        0
    }
}

fun main() {
    println(UncheckedException().price)
}