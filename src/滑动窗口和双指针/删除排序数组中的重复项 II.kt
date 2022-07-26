package 滑动窗口和双指针

class `删除排序数组中的重复项 II` {


}

//class Solution {
//    fun removeDuplicates(nums: IntArray): Int {
//        if (nums.size<3) return nums.size
//        var right = 2
//        var perper = 0
//        for (i in 2 until nums.size){
//            if (nums[i]!= nums[perper]){
//                nums[right] = nums[i]
//                right++
//            }
//            perper++
//        }
//        return right
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.removeDuplicates(intArrayOf(1,1,1,2,2,3))
//
//}
//
//internal class Solution {
//    fun removeDuplicates(nums: IntArray): Int {
//        val n = nums.size
//        if (n <= 2) {
//            return n
//        }
//        var slow = 2
//        var fast = 2
//        while (fast < n) {
//            if (nums[slow - 2] != nums[fast]) {
//                nums[slow] = nums[fast]
//                ++slow
//            }
//            ++fast
//        }
//        return slow
//    }
//}