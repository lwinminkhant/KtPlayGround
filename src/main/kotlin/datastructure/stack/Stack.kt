package datastructure.stack


/**
 * @created 22/12/2022 - 11:17 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/22/22
 */
interface Stack<T: Any> {
    fun pop():T?
    fun push(element:T)
    fun peek():T?
    val count:Int
    val isEmpty:Boolean
}