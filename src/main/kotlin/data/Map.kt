package data


/**
 * @created 24/10/2022 - 10:05 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/24/22
 */
class Map {

}
fun main() {
    val peopleAges = mutableMapOf(
            "Fred" to 30,
            "Ann" to 23
    )
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    //println(peopleAges)
    val a = 1
    val temp = peopleAges.map { "${it.key} is ${it.value}"}.joinToString(" , ")
    val s2 = "${temp.replace("is", "was")}, but now is $a"
    print(s2)
}
fun <T: Comparable<T>> search(list: List<T>, key: T){

}