package data

import java.math.BigInteger
import kotlin.Array


/**
 * @created 20/10/2022 - 2:19 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/20/22
 */
class Decimal {

}

fun main() {
    //val sixDecimal : Double = 1.0/6.0
    //print("%.6f, %.3f".format(sixDecimal, sixDecimal))
    val arr = arrayOf(256741038, 623958417, 467905213, 714532089, 938071625)
    //val arr = arrayOf(256741038, 623958417, 467905213, 714532089, 938071625)
    val ma = Int.MAX_VALUE

    //miniMaxSum(arr)
    val result : BigInteger = BigInteger.valueOf(2063136757)+BigInteger.valueOf(98071643)
    //print()
}

fun miniMaxSum(arr: Array<Int>) {
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    var total : BigInteger = BigInteger.valueOf(0L)

    for (i in arr) {
        if (max < i) {
            max = i
        }
        if (min > i) {
            min = i
        }
        total += BigInteger.valueOf(i.toLong())
    }
    print("%d %d ".format(total - max.toBigInteger(), total - min.toBigInteger()))
    print("min %d, max %d, total %d".format(min, max, total))
    // Write your code here

}
