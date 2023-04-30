package function


/**
 * @created 29/12/2022 - 2:00 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/29/22
 */

data class Hero(val name: String, val age: Int, val gander: Gander?)

fun main() {
    val num = listOf(1,2,3,4,5,6,7,8,9,0)
    val listPerson = listOf(
            Hero("John", 23, Gander.MALE),
            Hero("Bob", 42, Gander.MALE),
            Hero("Kate", 23, Gander.MALE)
    )
    //print(onlyEvenNumber(num))
    //print(squareNumber(num))
    //print(testAny(num))
    //print(findNegativeNumber(num))

    //val partition = partition(num)
    //print(partition.second)
    //print(partition.first)

    print(listPerson.groupBy { it.age == 23 })
}

fun onlyEvenNumber(num: List<Int>): List<Int> {
    //used to remove item from the collections
    return num.filter { it%2 ==0 }
}

fun squareNumber(num: List<Int>):List<Int>{
    //transformed each element in the collections
    return num.map { it * it }
}

fun testAny(num: List<Int>):Boolean{
    //return num.all { it>10 }
    return num.none { it < 0 }
    //return num.all { it % 2 ==0 }
}

fun findNegativeNumber(num: List<Int>): Int? {
    return num.indexOfFirst { it == 8}
}

fun partition(num: List<Int>): Pair<List<Int>, List<Int>> {
    return num.partition {it%2 ==0 }
}

fun x(num: List<Int>)= {num.groupBy { it }}

