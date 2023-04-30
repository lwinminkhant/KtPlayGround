package basic

import data.multipleType


/**
 * @created 06/12/2022 - 6:08 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/6/22
 */
class Elvis {
}

fun main() {

    val name: String? = null
    val nameWithDefault :String = name ?: "Default Name"

    //val?.let{} run only val is not null and won't throw any error
    name?.let {
        println(name.reversed())
    }
    name?.let { it1 -> print(it1.length) }

    println(nameWithDefault.reversed())
    print(nameWithDefault.length)


}