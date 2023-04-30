package data


/**
 * @created 16/04/2023 - 8:07 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 4/16/23
 */
class MyCollection {

}

var collections = mapOf<Any, Int>("a" to 1, "b" to 2, "c" to 3, "d" to 4, "e" to 5, "f" to 6)

val list1 = listOf(1, 2, 3)
val list2 = listOf("a", "b", "c")

data class MyPair(val num: Int, val string: String)

fun main() {
    var fintered = collections.filter { it.value > 3 }

    println(fintered)


    var myMap = collections.map { it.key.toString() }
        .filter { it > "c" }.shuffled()

    println(myMap)

    val newList = list1.zip(list2).map { MyPair(it.component1(), it.component2()) }

    for (z in newList) {
        println("${z.num}, ${z.string}")
    }

}