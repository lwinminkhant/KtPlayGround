package basic

import java.util.regex.Pattern


/**
 * @created 03/11/2022 - 11:40 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/3/22
 */
class Regex {

}

fun main() {
    val s = "00"

    print(s.matches("([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[0-2][0-4][0-9]|25[0-5])".toRegex()))
}
fun isMatch(s: String, p: String): Boolean {
    return s.matches(p.toRegex())
}