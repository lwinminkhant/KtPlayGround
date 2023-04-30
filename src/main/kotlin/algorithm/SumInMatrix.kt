package algorithm

import kotlin.Array


/**
 * @created 21/10/2022 - 9:51 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/21/22
 */
class SumInMatrix {
}

fun main() {
/*
* 11 2 4
   4 5 6
  10 8 -12
* */


    val arr = arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5, 6), arrayOf(10, 8, -12))
    print(diagonalDifference(arr))
}
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var sum1 = 0
    var sum2 = 0

    for(i in arr.indices){
        sum1 += arr[i][i]
    }

    for((ii, i) in (arr.indices).withIndex()){
        sum2 += arr[i][ii]
        println("$i, $ii")
    }


    //println(arr.contentToString())
    return abs(sum1-sum2)
}
fun abs(num:Int):Int{
    if(num<0)return (-1 * num)
    else return num
}