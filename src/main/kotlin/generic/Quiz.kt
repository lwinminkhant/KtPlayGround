package generic


/**
 * @created 07/11/2022 - 5:55 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/7/22
 */
class Quiz{
    val question1 = Question("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 7
        val progressText
            get() = "$answered of $total answered"
    }

    fun printQuiz1() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
    }
    fun printQuiz2() {
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
    }
    fun printQuiz3() {
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
    }
}