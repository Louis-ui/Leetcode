package 未分类

class _300_最长递增子序列 {
}

//class Solution {
//    fun lengthOfLIS(nums: IntArray): Int {
//        if (nums.isEmpty()) return 0
//        var size = nums.size
//        if (size == 1) return 1
//        var dp = IntArray(size)
//        dp[0] = 1
//        var max = 1
//        for (i in 1 until size){
//            dp[i] = 1
//            for (j in 0 until i){
//                if (nums[j]<nums[i]){
//                    dp[i] = dp[j]+1
//                }
//            }
//        }
//        return dp[size-1]
//    }
//}

//class Solution {
//    fun lengthOfLIS(nums: IntArray): Int {
//        if (nums.size == 0) {
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