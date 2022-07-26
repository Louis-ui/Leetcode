package 滑动窗口和双指针

class `将 x 减到 0 的最小操作数` {
}

//class Solution {
//    fun minOperations(nums: IntArray, x: Int): Int {
//        var left = 0
//        var right = 0
//        var sum = 0
//        var max = 0
//        var ans = -1
//        for (i in nums) max += i
//        val target = max - x
//        if (target<0) return -1
//        while (right < nums.size) {
//
//            sum += nums[right]
//            right++
//
//            while (sum > target) {
//                sum -= nums[left]
//                left++
//
//            }
//            if (sum == target) {
//                ans = Math.max(ans, right - left)
//            }
//        }
//        if (ans == -1) return ans
//        return nums.size - ans
//    }
//}