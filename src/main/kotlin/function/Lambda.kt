package function


/**
 * @created 28/03/2023 - 9:42 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 3/28/23
 */
class Lambda {
}

fun main() {
    testLet()
    testWith()
    testFilter()
}

fun testLet(){
    /**
     * The context object is available as an argument (it).
     *
     * The return value is the lambda result.*/

    var nums: List<Int>? = null

    nums?.let {
        println(it)
    }
    nums = listOf(1,2,3)
    nums?.let {
        println(it)
    }
}

fun testWith(){
    /**
     * The context object is available as a receiver (this).
     *
     * The return value is the lambda result.*/
    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }
}

fun testFilter(){
    val ints = listOf(1,2,3,4,-1,-5,-6,-8,-3)
    var sum = 0

    ints.filter { it > 0 }.forEach {
        sum += it
    }

    print(sum)
}

fun testRun(){

    /**
     * The context object is available as a receiver (this).
     *
     * The return value is the lambda result.*/
    
}


