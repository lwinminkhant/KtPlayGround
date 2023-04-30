package datastructure.tree

import datastructure.queue.ArrayListQueue


/**
 * @created 22/12/2022 - 11:08 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/22/22
 */
typealias Visitor<T> = (TreeNode<T>) -> Unit

class TreeNode<T>(val value: T) {
    private val children: MutableList<TreeNode<T>> = mutableListOf()
    fun add(child: TreeNode<T>) = children.add(child)
    fun forEachDepthFirst(visit: Visitor<T>) {
        visit(this)
        children.forEach {
            it.forEachDepthFirst(visit)
        }
    }

    fun forEachLevelOrder(visit: Visitor<T>) {
        visit(this)
        val queue = ArrayListQueue<TreeNode<T>>()
        children.forEach {
            queue.enqueue(it)
        }
        var node = queue.dequeue()

        while (node != null) {
            visit(node)
            node.children.forEach { queue.enqueue(it) }
            node = queue.dequeue()
        }
    }

    fun search(value: T):TreeNode<T>?{
        var result : TreeNode<T>? = null

        forEachDepthFirst {
            if(value == it.value){
                result = it
                println("Found value ${it.value}")
            }
        }
        return result
    }

    fun printEachLevel(){
        val queue = ArrayListQueue<TreeNode<T>>()
        var nodeLeftInCurrentLevel = 0

        queue.enqueue(this)
        while (queue.isEmpty.not()){
            nodeLeftInCurrentLevel = queue.count

            while (nodeLeftInCurrentLevel>0){
                val node = queue.dequeue()
                if(node != null){
                    println("${node.value}")

                    node.children.forEach{queue.enqueue(it)}

                    nodeLeftInCurrentLevel --
                }else {
                    break
                }
            }
            println()
        }
    }
}