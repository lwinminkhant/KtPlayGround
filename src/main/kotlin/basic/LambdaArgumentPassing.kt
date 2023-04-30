package basic


/**
 * @created 28/03/2023 - 4:29 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 3/28/23
 */
class LambdaArgumentPassing {

}

fun main() {
    doSomething("hi", ::print, ::print)
}
fun speak(m:String){
    println("speaking $m")
}
fun yield(m:String){
    println(m)
}
fun doSomething(message:String, action1: (String)->Unit, action2: (String)->Unit,){
    action1(message)
    action2(message)
}