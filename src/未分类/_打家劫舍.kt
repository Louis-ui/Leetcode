package 未分类

class _打家劫舍 {
}

//class Solution {
//    fun rob(nums: IntArray): Int {
//        val size = nums.size
//        val dp = IntArray(size)
//        if (nums.isEmpty()) return 0
//        dp[0] = nums[0]
//        if (nums.size == 1) return nums[0]
//        dp[1] = Math.max(nums[0], nums[1])
//        for (i in 2 until size) {
//            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1])
//        }
//        return dp[size - 1]
//    }
//}


