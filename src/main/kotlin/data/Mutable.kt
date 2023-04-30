package data


/**
 * @created 23/10/2022 - 10:30 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/23/22
 */
class Mutable {

}

fun main() {
    val list = mutableListOf(1,2,3,4)

    list += 100
    list.add(11)
    for(i in list)
    println(i)
}