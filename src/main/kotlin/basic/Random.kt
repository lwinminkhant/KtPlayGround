package basic

import kotlin.random.Random


/**
 * @created 20/03/2023 - 1:54 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 3/20/23
 */
class Random {
}

fun main() {
    (0..10).forEach {
        ('a'..'z').random().toString().map { it.toString().padStart(10, '*') }
        ('A'..'z').map { it }.shuffled().subList(0, 4).joinToString("")
            .forEach(::println)
    }
    val charPool : List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')

    val randomString = (1..10)
        .map { Random.nextInt(0, charPool.size) }
        .map(charPool::get)
        //.map{ charPool[it] }
        //.map{ charPool.get(it)}
        .joinToString("")
    println(randomString)
}