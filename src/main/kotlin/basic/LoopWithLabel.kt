package basic


/**
 * @created 22/12/2022 - 9:28 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/22/22
 */
class LoopWithLabel {
}

fun main() {
    startPoint@ for( i in 1..3){
        for (j in 5..7){
            if(i == 2 && j == 6) break@startPoint
            print ("$i,$j")
            print(" ")
        }
        println("$i loop ends")
    }

    println("We are done")
}