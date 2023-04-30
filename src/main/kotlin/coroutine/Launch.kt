package coroutine

import kotlinx.coroutines.*


/**
 * @created 26/09/2022 - 10:58 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 9/26/22
 */
class Launch {
    fun launchTest(){
        CoroutineScope(Dispatchers.IO).launch {
            //delay(2000)
            println("launch block")
        }
        CoroutineScope(Dispatchers.Default).launch {
            //delay(1000)
            print("Pause")
        }
        print("Pause")

    }
}

fun main() {
    Launch().launchTest()
}