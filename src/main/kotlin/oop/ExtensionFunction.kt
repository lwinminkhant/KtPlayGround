package oop


/**
 * @created 16/04/2023 - 9:53 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 4/16/23
 */
class ExtensionFunction{}
open class Super {

}
class Sub: Super(){
}
fun Super.myExtension() = "Defined for Super"
fun Sub.myExtension() = "Defined for Sub"


fun main(){

    val obj = Super()
    println(obj.myExtension())

    val sub = Sub()
    println(sub.myExtension())
}