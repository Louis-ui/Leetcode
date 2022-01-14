package 字节

class _在排序数组中查找元素的第一个和最后一个位置 {
}

//internal class Solution {
//    fun searchRange(nums: IntArray, target: Int): IntArray {
//        val leftIdx = binarySearch(nums, target, true)
//        val rightIdx = binarySearch(nums, target, false) - 1
//        return if (leftIdx <= rightIdx && rightIdx < nums.size && nums[leftIdx] == target && nums[rightIdx] == target) {
//            intArrayOf(leftIdx, rightIdx)
//        } else intArrayOf(-1, -1)
//    }
//
//    fun binarySearch(nums: IntArray, target: Int, lower: Boolean): Int {
//        var left = 0
//        var right = nums.size - 1
//        var ans = nums.size
//        while (left <= right) {
//            val mid = (left + right) / 2
//            if (nums[mid] > target || lower && nums[mid] >= target) {
//                right = mid - 1
//                ans = mid
//            } else {
//                left = mid + 1
//            }
//        }
//        return ans
//    }
//}
//
//
//class Solution {
//    fun searchRange(nums: IntArray, target: Int): IntArray {
//        var left = 0
//        var right = nums.size - 1
//        var mid = 0
//        var ans = 0
//        while (left <= right) {
//            mid = left + (right - left) / 2
//            if (nums[mid] == target) {
//                ans = mid
//                break
//            } else if (nums[mid] < target) {
//                left = mid+1
//            } else if (nums[mid] > target) {
//                right = mid-1
//            }
//        }
//        if (nums.isEmpty() || nums[ans]!=target) {
//            return intArrayOf(-1,-1)
//        }
//        var before = ans
//        var next = ans
//        if (nums.size==1) return intArrayOf(ans,ans)
//        while (nums[before]==target){
//            before--
//            if (before<0) break
//        }
//        while (nums[next]==target){
//            next++
//            if (next>nums.size-1) break
//        }
//        return intArrayOf(before+1,next-1)
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.searchRange(intArrayOf(2,2),2)
//}