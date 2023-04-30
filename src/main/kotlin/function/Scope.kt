package function


/**
 * @created 24/10/2022 - 5:06 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/24/22
 */
class Scope {

}
/**
 * let function
The let function has numerous applications, but it is generally used to prevent a NullPointerException from occurring.
The let function returns the lambda result and the context object is the it identifier.
 */
fun letScope(str: String?) {
    //println(str)

    str?.let {// 4
        print("\t")
        print(it)
        println()
    }
}

fun main() {

    //printNonNull(null)
    letScope(null)

    /**
     * with function
    The with function has a return type as the lambda result, and the context object is the this keyword, which refers to the object itself.
     */

    class Person {
        var firstName: String = "Elena Wilson"
        var age: Int = 28
    }

    val person = Person()
    println(person.firstName)
    println(person.age)

}
