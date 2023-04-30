package function


/**
 * @created 29/12/2022 - 8:05 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/29/22
 */
/* an infix function is a function that has the infix keyword
before its name and can be called using the infix notation
(omitting the dot and the parentheses for the call).
This allows you to write more concise and readable code in some cases.
* */
infix fun Int.x(int:Int):Int{ return int*this}

infix fun Int.times(str: String) = str.repeat(this)

fun main() {
    print(3.times("Hello\n"))
    print(5.x(3))
}