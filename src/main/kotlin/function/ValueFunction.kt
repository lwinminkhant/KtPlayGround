package function

import function.ValueFunction.Companion.square


/**
 * @created 04/11/2022 - 2:19 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/4/22
 */


class ValueFunction {

    // val double2: (Double) -> String =  {x->(x*2).toString()}
    val double: (Int) -> Int = { x -> (x * 2) }
    val triple: (Int) -> Int = { x -> (x * 3) }
    val multiple: (Int, Int) -> Int = { x, y -> x * y }
    val double_triple: (Int, Int) -> Int = { x, y -> double(x) * triple(y) }
    val dt: (Int) -> Int = { x -> double_triple(x, x) }

    val add: (Int, Int) -> Int = { x, y -> x + y }

    companion object {
        fun square(x: Int): Int = x * x
    }


}

class Functions {
    //Function References
    fun double(int: Int): Int = int * 2
    fun triple(int: Int): Int = int * 3
    val multiplyBy2: (Int) -> Int = ::double

    //compose functions
    //fun compose(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int = { f(g(it)) }
    val squareOfTriple = compose(::square, ::triple)

    fun compose2(f: (Any) -> Any, g: (Any) -> Any): (Any) -> Any = { f(g(it)) }

    companion object {
        fun <T, U, V> compose(f: (U) -> V, g: (T) -> U): (T) -> V = { f(g(it)) }

        val add: (Int) -> (Int) -> (Int) -> Int = { a ->
            { b -> { c -> a + b + c } }
        }
        val mult: IntBinOp = { a -> { b -> a * b } }

    }
}

typealias IntBinOp = (Int) -> (Int) -> Int

fun main() {
    //println(add(5)(4))
    //Functions().multiplyBy2(3)
    //println(ValueFunction().dt(5))//(5*2) (5*3)
    //println(Functions().squareOfTriple(5))//(5*3)5

    //println(square(5))

}