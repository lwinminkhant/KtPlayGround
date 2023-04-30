package datastructure.linkedlist


/**
 * @created 23/12/2022 - 1:16 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/23/22
 */
data class Node<T : Any>(
        var value: T,
        var next: Node<T>? = null
) {
    override fun toString(): String {
        return if (next != null)
            "$value -> ${next.toString()}"
        else "$value"
    }


    fun printInReverse(){
        next?.printInReverse()
        if (next != null){
            print(" -> ")
        }
        print(value.toString())
    }
}
