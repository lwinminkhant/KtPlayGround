package function


/**
 * @created 29/12/2022 - 3:41 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/29/22
 */
import function.Gander.*
enum class Gander{MALE, FEMALE}
fun main() {
    print(testOperation())
}
val heroes = listOf(
        Hero("The Captain", 60, MALE),
        Hero("Frenchy", 42, MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, FEMALE),
        Hero("First Mate", 29, MALE),
        Hero("Sir Stephen", 37, MALE))


fun testOperation(){
    val mapByName = heroes.associateBy { it.name }
    val unknownHero = Hero("Unknown", 0, null)
    print(mapByName.getOrElse("unknown") { unknownHero }.age)

    //=================================================================
    val mapByAge: Map<Int, List<Hero>> =
            heroes.groupBy { it.age }
    val (age, group) = mapByAge.maxByOrNull { (_, group) ->
        group.size
    }!!
    println(age)
    //=================================================================


    //val mapByName: Map<String, Hero> =
    //        heroes.associateBy { it.name }
    //print(mapByName["Frenchy"]?.age)//null
    //print(mapByName.getValue("Frenchy").age)//NoSuchElementException

    //=================================================================

    val (first, second) = heroes
            .flatMap { heroes.map { hero -> it to hero } }
            .maxByOrNull { it.first.age - it.second.age }!!

    print(first.name)
}