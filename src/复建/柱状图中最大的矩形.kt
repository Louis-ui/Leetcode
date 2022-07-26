package 复建

class 柱状图中最大的矩形 {
}

class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        val dp = IntArray(heights.size){-1}
        var min = heights[0]
        dp[0] = heights[0]
        for (i in 1 until heights.size){
            if (heights[i]<min) min = heights[i]
            val mid = Math.max((i+1)*min,heights[i])
            dp[i] = Math.max(dp[i-1],mid)
        }
        return dp[dp.size-1]
    }
}