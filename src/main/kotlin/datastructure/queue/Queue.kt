package datastructure.queue


/**
 * @created 22/12/2022 - 11:33 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/22/22
 */
interface Queue<T> {
    val count:Int
    val isEmpty:Boolean
    fun peek():T?
    fun enqueue(element:T):Boolean
    fun dequeue():T?

}