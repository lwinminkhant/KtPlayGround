package function


/**
 * @created 23/10/2022 - 4:53 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/23/22
 */
class KtCollection {
}

fun main() {
    //ktMap()
    ktZip()
    //ktFlatten()
    //ktStringRepresentation()

    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    println(decorations.filter { it[0] == 'p' })

}

fun ktMap() {
    val num = setOf(1, 2, 3)
    println(num.map { it * 9 })
    println(num.mapIndexed { idx, value -> value * idx })
}

fun ktZip() {
    val num = setOf(1, 2, 3, 4, 5)
    val numWord = setOf("one", "two", "three", "four")
    println(num zip numWord)
    println(num.zip(numWord))
    val twoWord = setOf("one", "two")
    println(num.zip(twoWord))
    println(num zip twoWord)
}

fun ktFlatten() {
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(1, 2))
    println(numberSets.flatten())
}

fun ktStringRepresentation() {
    val numbers = listOf("one", "two", "three", "four")

    //println(numbers)
    //println(numbers.joinToString())

    val listString = StringBuffer("The list of numbers: ")
    numbers.joinTo(listString)
    print(listString)

    //println(numbers.joinToString(separator = " | ", prefix = "start: ", postfix = "; end"))

    //val num = (1..100).toList()
    //println(num.joinToString(limit = 10, truncated = "<....>"))


}
