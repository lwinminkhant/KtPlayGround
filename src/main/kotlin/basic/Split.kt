package basic


/**
 * @created 29/12/2022 - 2:41 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/29/22
 */
class Split {
}

fun main() {
    val s = "4 * 6"

    val (a, op, c) = s.split(" ")

    print(a)
    print(op)
    print(c)
}