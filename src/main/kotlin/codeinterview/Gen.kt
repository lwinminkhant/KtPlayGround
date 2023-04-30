package codeinterview


/**
 * @created 23/12/2022 - 9:24 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/23/22
 */
class Gen {
}

fun main() {
    //val digit = "8459761263"
    val digit = "0123456789"

    //val num = "5439"

    val num = "210"
    val count = numGenerator(digit, num)
    println("Number of times $num appears as a subsequence in $digit: $count")
}
fun numGenerator(digit: String, num: String): Int {
    // Edge case: num is longer than digit
    if (num.length > digit.length) return 0

    // Initialize the count to zero
    var count = 0

    // Iterate over the digits in digit
    for (i in digit.indices) {
        // Check if the current digit in digit matches the first digit in num
        if (digit[i] == num[0]) {
            // Initialize a variable to store the length of the matching subsequence
            var len = 1
            // Initialize a variable j to 1, since the first digit in num has already been checked
            var j = 1
            // Iterate over the remaining digits in num
            while (j < num.length && i + j < digit.length) {
                // Check if the current digit in digit matches the current digit in num
                if (digit[i + j] == num[j]) {
                    // If the digits match, increment len and j
                    len++
                    j++
                } else {
                    // If the digits don't match, increment j and continue the loop
                    j++
                }
            }
            // If the length of the matching subsequence is equal to the length of num, increment the count
            if (len == num.length) count++
        }
    }

    return count
}