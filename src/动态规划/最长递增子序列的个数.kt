package 动态规划

class 最长递增子序列的个数 {
}

//internal class Solution {
//    fun findNumberOfLIS(nums: IntArray): Int {
//        val n = nums.size
//        var maxLen = 0
//        var ans = 0
//        val dp = IntArray(n)
//        val cnt = IntArray(n)
//        for (i in 0 until n) {
//            dp[i] = 1
//            cnt[i] = 1
//            for (j in 0 until i) {
//                if (nums[i] > nums[j]) {
//                    if (dp[j] + 1 > dp[i]) {
//                        dp[i] = dp[j] + 1
//                        cnt[i] = cnt[j] // 重置计数
//                    } else if (dp[j] + 1 == dp[i]) {
//                        cnt[i] += cnt[j]
//                    }
//                }
//            }
//            if (dp[i] > maxLen) {
//                maxLen = dp[i]
//                ans = cnt[i] // 重置计数
//            } else if (dp[i] == maxLen) {
//                ans += cnt[i]
//            }
//        }
//        return ans
//    }
//}