package basic

import unscramble.wordRandom
import kotlin.random.Random


/**
 * @created 20/03/2023 - 12:53 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 3/20/23
 */
class MultiDimensionArray {
}

fun main() {
    val twoD = arrayOf(arrayOf("00","01","02"), arrayOf("10","11","12"), arrayOf("20","21","22"))
    var m = Array(6) {a->Array(6) {b -> "%02d".format(a*10+b)} }
    //val arr = Array(rows) { r -> IntArray(cols) { c -> r + c } }
    /*for ((i,j) in (0..2).zip(0..2)){

    }*/
    /*for (i in m.indices){
        for (j in m.indices){
            print("${m[i][j]},")
        }
        print("\n")
    }*/




}