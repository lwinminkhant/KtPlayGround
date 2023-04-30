package algorithm


/**
 * @created 12/11/2022 - 3:18 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/12/22
 */
class DotProblem {
}

fun main() {
    val input = ".....xyz...uth...cvg....."

    val dotCount = input.count { it =='.' }

    val matches = "([a-z]+)".toRegex().findAll(input)

    val gs =  matches.map { it.groupValues[1] }.joinToString(".".repeat(dotCount/2))
    print(gs)
}