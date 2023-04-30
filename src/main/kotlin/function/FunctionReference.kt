package function


/**
 * @created 29/12/2022 - 9:27 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/29/22
 */
class FunctionReference {
}

fun isEven(int: Int):Boolean = int %2 == 0

val isE  = ::isEven

val isOdd: (Int)-> Boolean = {i -> i%2!=0 }

fun main() {
    //print(isE(19))
    //print(isOdd(19))

    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    print(numbers.all(isE))
}