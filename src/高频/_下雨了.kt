package 高频

class _下雨了 {
}

//class Solution {
//    fun trap(height: IntArray): Int {
//        val n = height.size
//        if (n == 0) {
//            return 0
//        }
//        val leftMax = IntArray(n)
//        leftMax[0] = height[0]
//        for (i in 1 until n) {
//            leftMax[i] = Math.max(leftMax[i - 1], height[i])
//        }
//        val rightMax = IntArray(n)
//        rightMax[n - 1] = height[n - 1]
//        for (i in n - 2 downTo 0) {
//            rightMax[i] = Math.max(rightMax[i + 1], height[i])
//        }
//        var ans = 0
//        for (i in 0 until n) {
//            ans += Math.min(leftMax[i], rightMax[i]) - height[i]
//        }
//        return ans
//    }
//}

//class Solution {
//    fun trap(height: IntArray): Int {
//        var left = 0
//        var right = 0
//        var ans = 0
//        for (i in 1 until height.size) {
//
//        }
//    }
//}