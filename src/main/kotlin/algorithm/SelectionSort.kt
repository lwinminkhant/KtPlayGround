package algorithm


/**
 * @created 25/10/2022 - 9:51 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/25/22
 */
class SelectionSort {
}

fun main() {
    val numArray = arrayOf(13,44,1,66,92,23,54,71,8,21,43)
    selectionSort(numArray)

}
fun selectionSort(intArray: Array<Int>){
    var posOfMin = 0
    for (num in intArray){
        posOfMin = num
        for (i in intArray){
            if(intArray[i]< intArray[posOfMin]){
                posOfMin =  i
            }
            val temp = intArray[num]
            intArray[num] = intArray[posOfMin]
            intArray[posOfMin] = temp
        }
    }

}