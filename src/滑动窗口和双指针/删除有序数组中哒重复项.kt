package 滑动窗口和双指针

class 删除有序数组中哒重复项 {
}

//class Solution {
//    fun removeDuplicates(nums: IntArray): Int {
//        if (nums.size <= 1) return nums.size
//        var temp1 = 0
//        var temp2 = 1
//        while (temp2<nums.size){
//            if (nums[temp1] == nums[temp2]){
//                temp2++
//            }else{
//
//            }
//
//        }
//    }
//}


//object Solution {
//    fun removeDuplicates(nums: IntArray): Int {
//        val len = nums.size
//        if (len < 2) {
//            return len
//        }
//        var j = 1
//        var pre = nums[0]
//        for (i in 1 until len) {
//            if (nums[i] != pre) {
//                nums[j] = nums[i]
//                pre = nums[j]
//                j++
//            }
//        }
//        return j
//    }
//}
//
//fun main() {
//    Solution.removeDuplicates(intArrayOf(1,1,2))
//}