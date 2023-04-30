package visibility

/**
 * @created 11/11/2022 - 11:58 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/11/22
 */
open class Base() {

    var publicVal = 1

    private var privateVal = 3 //private to Base class

    internal val internalVal = 10//visible inside the same module

    protected open val protectedOpen = 20//visible to the base and the derived class

    protected fun protectedFun() {}//visible to the base and the derived class

}
class Derived : Base(){
    override val protectedOpen: Int
        get() = 100

    init {
        protectedFun()
    }
}

fun main() {
    val base = Base()
    base.publicVal
    base.internalVal

    val derived = Derived()
    //derived.protectedOpen  //not visible

}