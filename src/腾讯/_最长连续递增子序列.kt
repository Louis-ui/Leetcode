package 腾讯


class _最长连续递增子序列 {
}

//class Solution { fun myFun() {
//    }
//
//    fun findLengthOfLCIS(nums: IntArray): Int {
//        if (nums.isEmpty()) return 0
//        val dp = IntArray(nums.size) { 0 }
//        var ans = Int.MIN_VALUE
//        dp[0] = 1
//        var i = 1
//        while (i < nums.size) {
//            if (nums[i] > nums[i - 1]) {
//                dp[i] = dp[i - 1] + 1
//            } else {
//                dp[i] = dp[i - 1]
//            }
//            ans = Math.max(ans, dp[i])
//            i++
//        }
//        return ans
//    }
//}
//
//fun main() {
//    var solution = Solution()
//
//
//    solution.findLengthOfLCIS(intArrayOf(1, 3, 5, 4, 7))
//}