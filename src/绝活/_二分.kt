package 绝活

class _二分 {
}

//class Solution() {
//    fun searchTarget(nums: IntArray, target: Int): Int {
//        var left = 0
//        var right = nums.size - 1
//        while (left <= right) {
//            var mid = left + (right - left) / 2
//            if (nums[mid] == target) {
//                return mid
//            } else if (nums[mid] < target) {
//                left = mid + 1
//            } else if (nums[mid] > target) {
//                right = mid - 1
//            }
//        }
//        return -1
//    }
//
//    fun searchLeft(nums: IntArray, target: Int): Int {
//        var left = 0
//        var right = nums.size
//        while (left < right) {
//            var mid = left + (right - left) / 2
//            if (nums[mid] == target) {
//                right = mid
//            } else if (nums[mid] < target) {
//                left = mid + 1
//            } else if (nums[mid] > target) {
//                right = mid
//            }
//        }
//        return left
//    }
//
//    fun searchRight(nums: IntArray, target: Int): Int {
//        var left = 0
//        var right = nums.size
//        while (left < right) {
//            var mid = left + (right - left) / 2
//            if (nums[mid] == target) {
//                left = mid
//            } else if (nums[mid] < target) {
//
//            } else if (nums[mid] > target) {
//
//            }
//        }
//        return left
//    }
//}
