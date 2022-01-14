package 未分类

class _1480_一维数组的动态和 {
}

//class Solution {
//    fun runningSum(nums: IntArray): IntArray {
//        var sum = 0
//        for (i in nums.indices){
//            sum += nums[i]
//            nums[i] = sum
//        }
//        return nums
//    }
//}

//class Solution {
//    fun runningSum(nums: IntArray): IntArray {
//        val answer: IntArray = IntArray(nums.size)
//        for (j in nums.indices) {
//            var i = 0
//            var sum: Int = 0
//            while (i <= j) {
//                sum += nums[i]
//                i++
//            }
//            answer[j] = sum
//        }
//        return answer
//    }
//}
