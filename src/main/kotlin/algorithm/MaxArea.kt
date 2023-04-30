package algorithm

import java.lang.Integer.max
import java.lang.StrictMath.min


/**
 * @created 06/01/2023 - 11:21 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 1/6/23
 */
class MaxArea {
}

fun main() {
    val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
    print(maxxArea(height))
}

fun maxArea(height: IntArray): Int {
    var maxArea = 0
    for (barI in height.indices) {
        var tempAMax = 0
        for (bar2I in height.indices){
            if(bar2I != barI){
                var minBar = height[bar2I]
                if(height[barI]<height[bar2I])
                    minBar = height[barI]
                val maxDiff = abs(bar2I-barI)
                tempAMax = minBar * maxDiff
            }
        }
        if (maxArea< tempAMax) maxArea = tempAMax
    }
    return maxArea
}

fun maxxArea(height: IntArray): Int {
    var maxArea = 0
    var left = 0
    var right = height.size - 1
    while (left < right) {
        val w = right - left
        val h = kotlin.math.min(height[left], height[right])
        maxArea = max(maxArea, h * w)

        if (height[left] < height[right]) {
            left++
        } else if(height[left]> height[right]){
            right--
        }else{
            left++
            right--
        }
    }
    return maxArea
}


fun mabs(int: Int):Int{
    return int and -int
}