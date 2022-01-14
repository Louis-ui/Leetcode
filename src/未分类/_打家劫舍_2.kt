package 未分类

class _打家劫舍_2 {
}

//class Solution {
//    fun rob(nums: IntArray): Int {
//        val length = nums.size
//        if (length == 1) {
//            return nums[0]
//        } else if (length == 2) {
//            return Math.max(nums[0], nums[1])
//        }
//        return Math.max(robRange(nums, 0, length - 2), robRange(nums, 1, length - 1))
//    }
//
//    fun robRange(nums: IntArray, start: Int, end: Int): Int {
//        var first = nums[start]
//        var second = Math.max(nums[start], nums[start + 1])
//        for (i in start + 2..end) {
//            val temp = second
//            second = Math.max(first + nums[i], second)
//            first = temp
//        }
//        return second
//    }
//}
//
