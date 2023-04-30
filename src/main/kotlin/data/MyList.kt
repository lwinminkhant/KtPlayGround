package data


/**
 * @created 06/11/2022 - 5:36 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/6/22
 */
class MyList {
}

fun main() {
    val list: MutableList<Int> = mutableListOf(1,2,3)
    list.add(5)
    //print(list)

    val solarSystem = mutableListOf("Mercury", "Venus", "Jupiter", "Earth", "Mars", "Saturn", "Uranus", "Neptune")

    solarSystem.add(0,"Pluto")

    print(solarSystem)
    println(solarSystem.containsAll(listOf("Mercury","Earth")))

}