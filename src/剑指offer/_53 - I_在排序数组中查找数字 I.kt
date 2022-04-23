package 剑指offer

class `_53 - I_在排序数组中查找数字 I` {
}
//
//class Solution {
//    fun search(nums: IntArray, target: Int): Int {
//        var left = 0
//        var right = nums.size - 1
//        var ans = 0
//        while (left < right) {
//            var mid = left + (right - left) / 2
//            if (nums[mid] == target) {
//                ans ++
//            } else if (nums[mid] > target) {
//                right = mid-1
//            } else if (nums[mid] < target) {
//                left = mid+1
//            }
//        }
//        return ans
//    }
//}
//
//internal class Solution {
//    fun search(nums: IntArray, target: Int): Int {
//        return getRightMargin(nums, target) - getRightMargin(nums, target - 1)
//    }
//
//    fun getRightMargin(nums: IntArray, target: Int): Int {
//        var left = 0
//        var right = nums.size - 1
//        while (left <= right) {
//            val mid = (left + right) / 2
//            if (nums[mid] <= target) {
//                left = mid + 1
//            } else {
//                right = mid - 1
//            }
//        }
//        return left
//    }
//}
//
//fun main() {
//    val solution = Solution()
//    solution.search(intArrayOf(5,7,7,8,8,10),8)
//}