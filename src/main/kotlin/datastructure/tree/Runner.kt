package datastructure.tree

import kotlin.math.tan


/**
 * @created 23/12/2022 - 11:45 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 12/23/22
 */
fun makeBeverageTree():TreeNode<String>{
    val tree = TreeNode("Beverage")
    val hot = TreeNode("hot")
    val cold = TreeNode("cold")

    val tea = TreeNode("tea")
    val coffee = TreeNode("coffee")
    val chocolate = TreeNode("chocolate")

    val blackTea = TreeNode("black")
    val greenTea = TreeNode("green")
    val chaiTea = TreeNode("chai")

    val soda = TreeNode("soda")
    val milk = TreeNode("milk")

    val gingerAle = TreeNode("ginger ale")
    val bitterLemon = TreeNode("bitter lemon")

    tree.add(hot)
    tree.add(cold)

    hot.add(tea)
    hot.add(coffee)
    hot.add(chocolate)

    cold.add(soda)
    cold.add(milk)

    tea.add(blackTea)
    tea.add(greenTea)
    tea.add(chaiTea)

    soda.add(gingerAle)
    soda.add(bitterLemon)
    return tree
}
fun main() {
    val tree = makeBeverageTree()
    tree.forEachDepthFirst { println(it.value) }

    ///tree.printEachLevel()
}