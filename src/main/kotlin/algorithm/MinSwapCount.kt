package algorithm


/**
 * @created 09/01/2023 - 12:02 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 1/9/23
 */
class MinSwapCount {
}
fun minimumSwaps(arrs: Array<Int>): Int {
    var swapCount = 0
    //2,3,4,1,5
    val arr = arrs
    for (i in 0 until arr.size) {
        while (arr[i] != i + 1) {
            val temp = arr[arr[i] - 1]
            arr[arr[i] - 1] = arr[i]
            arr[i] = temp
            swapCount++
        }
    }
    return swapCount
}

fun main() {
    print(minimumSwaps(arrayOf(2,3,4,1,5)))
}

fun minimumSwap(arr: Array<Int>): Int {
    var swaps = 0
    for (i in 0 until arr.size - 1) {
        for (j in 0 until arr.size - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                swaps++
            }
        }
    }
    return swaps
}
