package 剑指offer

class _21_调整数组顺序使奇数位于偶数前面 {
}

//class Solution {
//    fun exchange(nums: IntArray): IntArray {
//        var i = 0
//        var j = nums.size - 1
//        while (i < j) {
//            while ((nums[i] and 1) == 0) {
//                while ((nums[j] and 1) != 0) {
//                    var mid = nums[i]
//                    nums[i] = nums[j]
//                    nums[j] = mid
//                }
//            }
//            i++
//            j--
//        }
//        return nums
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    var array = intArrayOf(2,4,6)
//    solution.exchange(array)
//}