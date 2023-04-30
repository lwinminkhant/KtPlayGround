package oop


/**
 * @created 02/04/2023 - 2:31 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 4/2/23
 */
sealed class Result
class Success(val message: String) : Result()
class Error(val error: Exception) : Result()

fun handleResult(result: Result) {
    when (result) {
        is Success -> println(result.message)
        is Error -> println(result.error.message)
    }
}






