package algorithm

import basic.max


/**
 * @created 14/03/2023 - 11:05 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 3/14/23
 */
class MaxRepeat {

}

fun main() {

    val s = "abcdefffffaer"
    print(maxCharCount(s))
}

fun maxCharCount(str : String): Char? {
    val characterMap = mutableMapOf<Char,Int>()

    var maxCount = 0
    var maxChar: Char? = null

    for (c in str){
        val count = characterMap.getOrDefault(c,0)+1
        characterMap[c] = count
        if(maxCount<count){
            maxChar = c
            maxCount = count
        }
    }
    return maxChar

}