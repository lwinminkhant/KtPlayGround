package algorithm


/**
 * @created 03/11/2022 - 8:02 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/3/22
 */
class Palindrome {
}

fun main() {
    val s = "aaasdfsadfabcdaasdasdfasdffasdfasda"
    //palindromeIndex(s)

    //print(isPalindromeNumber(1578751))
    val numberx = 121
    print(isPalindromeg(numberx))
}
fun palindrome(s: String): Boolean {
    val half = s.length/2
    var half2 = half
    if(s.length%2 != 0) half2++

    if(s.subSequence(0, half) == s.subSequence(half2, s.length)){
        return true
    }
    return false
}
fun palindromeIndex(s: String): Int {
    var start = 0
    var end = s.length - 1
    while (start < end && s[start] == s[end]) {
        start++
        end--
    }
    if (start >= end) return -1 // already a palindrome
    // We need to delete here
    if (isPalindrome(s, start + 1, end)) return start
    return if (isPalindrome(s, start, end - 1)) end else -1
}

fun isPalindrome(s: String, start: Int, end: Int): Boolean {
    var start: Int = start
    var end:Int = end
    while (start < end && s[start] == s[end]) {
        start++
        end--
    }
    return start >= end
}

fun isPalindromeNumber(original: Int):Int{
    var reverseNum = 0
    var tempOriginal = original
    while (tempOriginal > 0) {
        val lastDigit = tempOriginal % 10
        reverseNum = reverseNum * 10 + lastDigit
        tempOriginal /= 10
    }
    return if (original == reverseNum) {
        1
    } else {
        0
    }
}

fun isPalindromex(x: Int): Boolean {
    var temp = x
    var reversed = 0

    while (temp>0){
        val lastDigit = temp%10
        temp /= 10
        reversed = reversed *10 + lastDigit
    }

    return reversed==x
}

fun isPalindromeg(x: Int): Boolean {
    var temp = x
    var reversed = 0
    while(temp>0){
        val lastDigit = temp%10
        temp /= 10
        reversed = reversed *10 + lastDigit

    }
    return reversed == x
}
