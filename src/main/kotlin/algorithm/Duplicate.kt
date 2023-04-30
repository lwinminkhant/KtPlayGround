package algorithm


/**
 * @created 14/03/2023 - 12:51 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 3/14/23
 */
class Duplicate {
}

fun isContainDuplicate(nums: IntArray): Boolean {
    val temp = HashMap<Int,Boolean>()
    nums.forEach {
        if(temp.contains(it))return true
        else temp[it] = true
    }
    return false

}


fun main() {
    val intArray = intArrayOf(1,2,3,4,1)
    print(isContainDuplicate(intArray))
}