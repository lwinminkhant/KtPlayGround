package algorithm


/**
 * @created 14/03/2023 - 2:22 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 3/14/23
 */
class MaxSubArray {

}

fun maxSubArray2(nums: IntArray):Int{
    var max1 = Int.MIN_VALUE
    for(i in nums.indices){
        var max2 = Int.MIN_VALUE
        var total =0
        for (ii in i until nums.size){
            var n = nums[ii]
             total += n
            if(total>max2){
                max2 = total
            }
        }
        if(max1<max2) max1 = max2
    }
    return max1;
}

fun maxSubArray(nums: IntArray): Int {
    var maxSum = Int.MIN_VALUE
    var currentSum = 0

    for (num in nums) {
        currentSum += num
        maxSum = maxOf(maxSum, currentSum)
        currentSum = maxOf(0, currentSum)
    }

    return maxSum
}
fun main() {
    val nums = intArrayOf(-2,-1,-3,4,-1,2,1,-5,4)
    print(maxSubArray(nums))
}