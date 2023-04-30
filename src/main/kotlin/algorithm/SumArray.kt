package algorithm


/**
 * @created 07/01/2023 - 7:41 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 1/7/23
 */
class SumArray {

}
fun addArrays(first: IntArray,second: IntArray): IntArray? {
    val num = 0
    /*for (i in first){
        n
    }*/
    return null
}
fun arrayToNumber(){
    val iArray = arrayOf(-1,2,3)
    val num : Int = iArray.joinToString("").toInt()

}
fun numToString(){
    val num = -1738
    var temp = num
    var array = listOf<Int>()
    while (temp>0){
        array[0]
    }
}
/*fun numberToArray(num: Int): List<Int> {
    return num.toString().map { it.toString().toInt() }
}*/
fun numberToArray(num: Int): List<Int> {
    var number = num
    val isNegative = number < 0
    if (isNegative) {
        number = number.unaryMinus()
    }
    val array = number.toString().map { it.toString().toInt() }
    return if (isNegative) {
        arrayOf(-array[0]).toMutableList() + array.drop(1)
    } else {
        array
    }
}
fun test(){
    val number = 123
    val array =  number.toString().map { it.toString().toInt() }
    val array2 = arrayOf(532)
    print(array.toList())
    //print((array+array2).toList())

}
fun num2Array(int: Int):IntArray{
    return int.toString().map { it.toString().toInt() }.toIntArray()
}
fun main() {
    //test()
    val l1 = listOf(1,2,7,6)
    val l2 = listOf(9,5,6)
    val l3 = l1 + l2
    print(l3.drop(1))
    //print(num2Array(1).toList())
}