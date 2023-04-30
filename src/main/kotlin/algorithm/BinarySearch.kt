package algorithm


/**
 * @created 25/10/2022 - 12:50 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/25/22
 */
class BinarySearch {
}

fun main() {
    val numbers = arrayOf(1,20,23,40,55,61,73,81,90,310)
    fun binarySearch(list: Array<Int>, find: Int): Int{
        var first = 0
        var last = list.size-1
        var mid: Int
        var midValue : Int
        while (first<=last){
            mid = (first+last)/2
            midValue = list[mid]
            if(midValue == find) {
                return mid
            }else{
                if(find>mid){
                    first = mid +1
                }else last = mid - 1
            }

        }
        return -1
    }
    print(binarySearch(numbers, 24))
}