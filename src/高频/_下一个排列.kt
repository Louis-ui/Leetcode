package 高频

import kotlin.math.sign

class _下一个排列 {
}

//class Solution {
//    fun nextPermutation(nums: IntArray) {
//        var i = nums.size - 2
//        while (i >= 0 && nums[i] >= nums[i + 1]) {
//            i--
//        }
//        if (i >= 0) {
//            var j = nums.size - 1
//            while (j >= 0 && nums[i] >= nums[j]) {
//                j--
//            }
//            swap(nums, i, j)
//        }
//        reverse(nums, i + 1)
//    }
//
//    fun swap(nums: IntArray, i: Int, j: Int) {
//        val temp = nums[i]
//        nums[i] = nums[j]
//        nums[j] = temp
//    }
//
//    fun reverse(nums: IntArray, start: Int) {
//        var left = start
//        var right = nums.size - 1
//        while (left < right) {
//            swap(nums, left, right)
//            left++
//            right--
//        }
//    }
//}

//class Solution {
//    fun nextPermutation(nums: IntArray) {
//        var i = nums.size - 2
//        while (i >= 0 && nums[i] >= nums[i + 1]) {
//            i--
//        }
//        if (i >= 0) {
//            var j = nums.size - 1
//            while (j >= 0 && nums[i] >= nums[j]) {
//                j--
//            }
//            swap(nums, i, j)
//        }
//        reverse(nums, i + 1)
//    }
//
//    fun swap(nums: IntArray, i: Int, j: Int) {
//        val temp = nums[i]
//        nums[i] = nums[j]
//        nums[j] = temp
//    }
//
//    fun reverse(nums: IntArray, start: Int) {
//        var left = start
//        var right = nums.size - 1
//        while (left < right) {
//            swap(nums, left, right)
//            left++
//            right--
//        }
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.nextPermutation(intArrayOf(4,5,2,6,3,1))
//}