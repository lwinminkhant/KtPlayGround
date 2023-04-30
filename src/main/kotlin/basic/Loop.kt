package basic

import java.text.SimpleDateFormat
import kotlin.math.absoluteValue
import kotlin.random.Random


/**
 * @created 20/10/2022 - 9:47 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/20/22
 */
class Loop {
}

fun main() {
    /*for (i in 1..6){
        for (ii in  1..i*i){
            print("*")
        }
        print("\n")
    }*/
    /*for (i in 10 downTo 1 step 2 ){
        print("I'm Genius\n")
    }*/
    val a = "12:40:22AM"

    //print(SimpleDateFormat("HH:mm:ss").format(SimpleDateFormat("hh:mm:ssa").parse(a)))

    /*var i = 0
    do {
        print("a")
        i++
    }while ( i<0)*/
    val array = arrayOf(1,3,7,9)
    for (i in array.indices){/*val list = List(10){ Random.nextInt().rem(100 )*10}
    print(list)*/
        print(array[i])
    }



}