package 滑动窗口和双指针

class 最长连续递增序列 {
}


//class Solution {
//    fun findLengthOfLCIS(nums: IntArray): Int {
//        val len = nums.size
//        var res = 0
//        var i = 0
//        var j = 0
//        // 循环不变量 [i..j) 严格单调递增
//        while (j < len) {
//            if (j > 0 && nums[j - 1] >= nums[j]) {
//                i = j
//            }
//            j++
//            res = Math.max(res, j - i)
//        }
//        return res
//    }
//}
//
