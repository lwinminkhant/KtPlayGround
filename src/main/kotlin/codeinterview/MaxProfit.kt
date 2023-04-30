package codeinterview


/**
 * @created 22/12/2022 - 10:52 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/22/22
 */

fun maxProfit(monthlyProfit: IntArray): Pair<Int, Int> {
    var maxSum = Int.MIN_VALUE
    var maxStartIndex = 0
    var maxEndIndex = 0

    for (startIndex in monthlyProfit.indices) {
        var sum = 0
        for (endIndex in startIndex until monthlyProfit.size) {
            sum += monthlyProfit[endIndex]
            if (sum > maxSum) {
                maxSum = sum
                maxStartIndex = startIndex
                maxEndIndex = endIndex
                println("Sum: $sum")
                println("startIndex: $startIndex")
                println("endIndex: $endIndex")

            }
        }
    }

    return Pair(maxStartIndex, maxEndIndex)
}


fun main() {
    val monthlyProfit = intArrayOf(2,-1, 9, 0, 8, -7, 6, -24)
    val (startIndex, endIndex) = maxProfit(monthlyProfit)
    println("The maximum profit occurs between months $startIndex and $endIndex")
}