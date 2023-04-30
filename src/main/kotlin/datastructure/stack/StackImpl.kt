package datastructure.stack


/**
 * @created 22/12/2022 - 11:19 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/22/22
 */
class StackImpl<T:Any>: Stack<T> {
    private val storage = arrayListOf<T>()
    override fun pop(): T? {
        return storage.removeLastOrNull()
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun peek(): T? {
        return storage.lastOrNull()
    }

    override val count: Int
        get() = storage.size

    override val isEmpty: Boolean
        get() = storage.isEmpty()


}

fun String.isValidParenthesis():Boolean{
    val stack = StackImpl<Char>()
    for (char in this){
        when(char){
            '('->{
                stack.push(char)
            }
            ')'->{
                if(stack.isEmpty){
                    return false
                }else{
                    stack.pop()
                }
            }
        }
    }
    return stack.isEmpty
}