package 滑动窗口和双指针

class 颜色分类 {
}


//class Solution {
//    fun sortColors(nums: IntArray): Unit {
//
//        if (nums.size < 2) return Unit
//
//
//        // 0 [0,p0)
//        //1 [po,i)
//        //2 (p2,size-1]
//
//        var p0 = 0
//        var i = 0
//        var p2 = nums.size - 1
//        while (i <= p2) {
//            if (nums[i] == 0) {
//                swap(nums, i, p0)
//                p0++
//                i++
//            } else if (nums[i] == 1) {
//                i++
//            } else {
//                swap(nums, i, p2)
//                p2--
//            }
//        }
//    }
//
//    fun swap(nums: IntArray, temp1: Int, temp2: Int) {
//        val mid = nums[temp1]
//        nums[temp1] = nums[temp2]
//        nums[temp2] = mid
//    }
//
//}
//
//
//fun main() {
//    var solution = Solution()
//    solution.sortColors(intArrayOf(2, 0, 2, 1, 1, 0))
//}