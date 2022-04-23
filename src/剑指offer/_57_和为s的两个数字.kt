package 剑指offer

class _57_和为s的两个数字 {
}

//class Solution {
//    fun twoSum(nums: IntArray, target: Int): IntArray {
//
//        var i = 0
//        var j = nums.size - 1
//        var s = 0
//        while (i < j) {
//            s = nums[i] + nums[j]
//            when (true) {
//                s == target -> return intArrayOf(nums[i], nums[j])
//                s < target -> i++
//                s > target -> j--
//            }
//        }
//        return intArrayOf()
//    }
//}