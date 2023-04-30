package generic

import java.net.URL


/**
 * @created 16/04/2023 - 10:07 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 4/16/23
 */
class Reified {


}

inline fun <reified T> getType(value: T): String {
    return when (value) {
        is String -> "$value string"
        is Int -> "$value int"
        else -> "$value unknown"
    }
}

fun main() {
    val v1 = 1
    val v2 = "a"
    val v3 = 'c'
    val v4 = true
    val v5 = 1.0
    val v6 = 1L
    val v7 = 1F

    val url = "http://localhost:3000/simpleuser"
    val result = getType(v1)
    println(getType(v2))

}

data class Person(val name: String, val age: Int)

/*inline fun <reified T> create(url: String): T {
    val json = URL(url).readText()

}*/
