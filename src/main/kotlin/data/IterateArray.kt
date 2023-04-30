package data

import kotlin.Array


/**
 * @created 09/10/2022 - 1:04 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/9/22
 */
class IterateArray {

}

fun main() {
    var max : Int = Integer.MIN_VALUE
    val asf : Array<Array<Int>> = Array(6, { i -> Array(6, { j -> i*j} )})
    val arr : Array<Array<Int>> = Array(6) { i -> Array(6) { j -> i * j } }
    for(col in 0 until 4){
        for (row in 0 until 4){
            var clock = arr[col][row] + arr[col][row+1] + arr[col][row+2]+
                    arr[col+1][row+1]+
                    arr[col+2][row] + arr[col+2][row+1] + arr[col+2][row+2]
        }
    }
    var i = 0
    var d = 0
    var result = arrayOf(1,2,3,4,5)
    print(rotLeft(result,4).asList())

}
fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    val result: Array<Int> = Array(a.size){ 0}

    for(i in a.indices){
        if(i+d >= a.size){
            result[i] = a[(i+d)-a.size]
            print((i+d)-a.size)
        }else{
            result[i] = a[i+d]
            print(i+d)
        }


    }
    return result
}