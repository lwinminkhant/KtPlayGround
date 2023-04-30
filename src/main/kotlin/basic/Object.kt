package basic


/**
 * @created 24/10/2022 - 3:27 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/24/22
 */
class Object {

}

fun main() {
    rentPrice(10,20,40)
}
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  //1

    val dayRates = object {                                                     //2
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }


    val total = dayRates.standard + dayRates.festivity + dayRates.special       //3

    print("${dayRates.standard} ${dayRates.festivity} ${dayRates.special}")
    print("Total price: $$total")                                               //4

}