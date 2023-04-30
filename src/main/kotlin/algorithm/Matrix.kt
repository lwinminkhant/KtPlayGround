package algorithm


/**
 * @created 02/11/2022 - 10:13 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/2/22
 */
class Matrix {

}

fun main() {
    val matrix = arrayOf(
            intArrayOf(10, 1, 100, 113),
            intArrayOf(23, 44, 199, 221),
            intArrayOf(23, 44, 199, 221),
            intArrayOf(199, 55, 3, 86)
    )

    fun reverseRow(rowNo: Int){
        val temp = arrayOfNulls<Int>(4)
        for(i in 0 .. 3){
            temp[i] = matrix[rowNo][3-i]
        }
        for (i in 0..3){
            matrix[rowNo][i] = temp[i]!!
        }
    }
    fun reverseColumn(colNo: Int){
        val temp = arrayOfNulls<Int>(4)
        for(i in 0 .. 3){
            temp[i] = matrix[3-i][colNo]
        }
        for (i in 0..3){
            matrix[i][colNo] = temp[i]!!
        }
    }
    for (i in 0 until 4) {
        for (ii in 0 until 4) {
            print(matrix[i][ii])
            print(",")
        }
        println()
    }
    reverseColumn(2)
    reverseRow(1)
    for (i in 0 until 4) {
        for (ii in 0 until 4) {
            print(matrix[i][ii])
            print(",")
        }
        println()
    }
}