package function


/**
 * @created 10/11/2022 - 9:13 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/10/22
 */
class HigherOrderFunction {


}
class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double


)

fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filteredWords = words.filter { it.startsWith("a") }.shuffled().sorted()

    val cookies = listOf(
        Cookie(
            name = "Chocolate chip",
            softBaked = false,
            hasFilling = false,
            price = 1.69
        ),
        Cookie(
            name = "Banana Walnut",
            softBaked = true,
            hasFilling = false,
            price = 1.49
        ),
        Cookie(
            name = "Vanilla Creme",
            softBaked = false,
            hasFilling = true,
            price = 1.59
        ),
        Cookie(
            name = "Chocolate Peanut Butter",
            softBaked = false,
            hasFilling = true,
            price = 1.49
        ),
        Cookie(
            name = "Snickerdoodle",
            softBaked = true,
            hasFilling = false,
            price = 1.39
        ),
        Cookie(
            name = "Blueberry Tart",
            softBaked = true,
            hasFilling = true,
            price = 1.79
        ),
        Cookie(
            name = "Sugar and Sprinkles",
            softBaked = false,
            hasFilling = false,
            price = 1.39
        )
    )

    /*cookies.forEach {
        println("${it.name}")
    }*/

    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }


    print(fullMenu)

    val ck = Cookie("Strawberry cookie", false,false,110.0)
    ck.also {
        it.price
    }
    //print(filteredWords)
}

