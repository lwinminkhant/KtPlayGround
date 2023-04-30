package generic


/**
 * @created 07/11/2022 - 5:34 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/7/22
 */

fun main() {
    Quiz.printProgressBar()
}
fun Quiz.StudentProgress.printProgressBar() {

    repeat(answered) { print("l") }
    repeat(total - answered) { print(".") }
    println()
    println(progressText)

    val quiz = Quiz()
    quiz.printQuiz1()
    quiz.printQuiz2()
    quiz.printQuiz3()
}

