package data


/**
 * @created 23/10/2022 - 7:17 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/23/22
 */
class DataStructure {
}

fun main() {
    val list = (1..10).toList().toMutableList()
    val set = (1..10).toSet().toMutableSet()
    list.add(1)
    set += 1

    val listBuffer = StringBuffer("list: ")
    val setBuffer = StringBuffer("set: ")
    println(list.joinTo(listBuffer))

    println(set.joinTo(setBuffer))

}