package generic


/**
 * @created 07/11/2022 - 5:55 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/7/22
 */
class Question<T>(
        val questionText: String,
        val answer: T,
        val difficulty: Difficulty
)