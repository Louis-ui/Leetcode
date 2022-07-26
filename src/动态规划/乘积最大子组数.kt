package 动态规划

class 乘积最大子组数 {
}

//class Solution {
//    fun maxProduct(nums: IntArray): Int {
//        var dp = IntArray(nums.size)
//        var max = Int.MIN_VALUE
//        dp[0] = nums[0]
//        for (i in 1 until nums.size){
//           dp[i] =  Math.max(dp[i-1],dp[i-1]*nums[i])
//
//        }
//    }
//}
//
//internal class Solution {
//    fun maxProduct(nums: IntArray): Int {
//        val length = nums.size
//        val maxF = IntArray(length)
//        val minF = IntArray(length)
//        System.arraycopy(nums, 0, maxF, 0, length)
//        System.arraycopy(nums, 0, minF, 0, length)
//        for (i in 1 until length) {
//            maxF[i] = Math.max(maxF[i - 1] * nums[i], Math.max(nums[i], minF[i - 1] * nums[i]))
//            minF[i] = Math.min(minF[i - 1] * nums[i], Math.min(nums[i], maxF[i - 1] * nums[i]))
//        }
//        var ans = maxF[0]
//        for (i in 1 until length) {
//            ans = Math.max(ans, maxF[i])
//        }
//        return ans
//    }
//}