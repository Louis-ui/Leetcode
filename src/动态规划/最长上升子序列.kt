package 动态规划

class 最长上升子序列 {
}

//class Solution {
//    fun lengthOfLIS(nums: IntArray): Int {
//        if (nums.isEmpty()) return 0
//        if (nums.size == 1) return 1
//        val dp = IntArray(nums.size) { -1 }
//        dp[0] = 1
//        var ans = Int.MIN_VALUE
//        var max = nums[0]
//        for (i in 1 until nums.size) {
//            dp[i] = 1
//            for (j in 0 until i) {
//                if (nums[i] > nums[j]) {
//                    dp[i] = Math.max(dp[i], dp[j] + 1)
//                }
//            }
//            ans = Math.max(ans, dp[i])
//        }
//        return ans
//    }
//}
//
//internal class Solution {
//    fun lengthOfLIS(nums: IntArray): Int {
//        if (nums.isEmpty()) {
//            return 0
//        }
//        val dp = IntArray(nums.size)
//        dp[0] = 1
//        var maxans = 1
//        for (i in 1 until nums.size) {
//            dp[i] = 1
//            for (j in 0 until i) {
//                if (nums[i] > nums[j]) {
//                    dp[i] = Math.max(dp[i], dp[j] + 1)
//                }
//            }
//            maxans = Math.max(maxans, dp[i])
//        }
//        return maxans
//    }
//}