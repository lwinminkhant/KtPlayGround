package function


/**
 * @created 18/05/2023 - 6:38 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 5/18/23
 */
class TakeIfUnless {

    fun process(callback: () -> Unit) {

    }
    fun sdf(){
        process {
            // do something
        }
    }


}

fun main() {
    val myString = "hello"
    val result = myString
        .takeIf { it.length > 2 }
        ?.toUpperCase()
    val result2 = myString
        .takeUnless { it.length > 2 }
        ?.toUpperCase()
    print(result)
    print(result2)
}
// good
