package unscramble

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


/**
 * @created 28/02/2023 - 9:33 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 2/28/23
 */
private fun shuffleCurrentWord(word: String): String {
    val tempWord = word.toCharArray()
    // Scramble the word
    tempWord.shuffle()
    while (String(tempWord).equals(word)) {
        tempWord.shuffle()
    }
    return String(tempWord)
}
fun wordRandom():String{
    val words = listOf("a","b","c","d")
    return words.random()
}
fun main(){
    val b:String? = null
    print(b?.length?:0)
}
fun task()=runBlocking {
    val task = GlobalScope.launch {
        delay(1000L)
        println("there")
    }
    task.join()
    print("Hello, ")
}
fun run(obj:Any){
    print(obj::class)
}
fun t(){
    val a = 3
    val b =10
    print(DatabaseManager.x)
}

object DatabaseManager {
    val x = 10000


    //val l:Long = i
}
