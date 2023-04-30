package data


/**
 * @created 21/10/2022 - 10:56 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/21/22
 */
class ArrayTest {
}

fun main() {
    multipleType()
}
fun multipleType(){
    val array = arrayOf(1,"two",true, 4.0)
    for (i in array){
        println("$i is type of ${i::class.simpleName}")
    }
}
fun sub(){
    val first = listOf(1, 2, 3, 4, 5)
    val second = listOf(1, 2, 3)

    val difference = first.minus(second)

    //print(difference)
    val hashMap = HashMap<Int,Int>()
    hashMap.put(1,99)
    val mdarray = Array(6){i ->  Array(6){ii -> i*ii } }

    val gg  = mdarray[1][1]
    print(gg)
    print(hashMap.values.toList().get(0))

}