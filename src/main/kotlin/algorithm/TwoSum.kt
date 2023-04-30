package algorithm


/**
 * @created 29/11/2022 - 10:53 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/29/22
 */
class TwoSum {
    fun run() {
        val nums = arrayOf(3, 2, 4)

        for (i in nums.indices) {
            print(i)
        }
    }
}

fun main() {
    print(Solution().twoSum(intArrayOf(3,3),6).toList())
    //print(TwoSum().run())
}
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        for (i in nums.indices){
            for (ii in nums.indices){
                if(target == nums[i]+nums[ii]){
                    result[0] = i
                    result[1] = ii
                    return result
                }
            }
        }
        return result
    }
}

