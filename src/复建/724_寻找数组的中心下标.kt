package 复建

import java.util.*


class `724_寻找数组的中心下标` {
}

//class Solution {
//    fun pivotIndex(nums: IntArray): Int {
//        if (nums.isEmpty())return -1
//        var left = nums[0]
//        var right = nums[nums.size-1]
//        var leftTemp = 0
//        var rightTemp = nums.size-1
//        while (left!= right && leftTemp<rightTemp){
//            if (left > right){
//                rightTemp--
//                right += nums[rightTemp]
//            }else{
//                leftTemp++
//                left += nums[leftTemp]
//            }
//            if (left == right) return leftTemp+1
//        }
//        return -1
//    }
//}
//
//internal class Solution {
//    fun pivotIndex(nums: IntArray): Int {
//        val total = Arrays.stream(nums).sum()
//        var sum = 0
//        for (i in nums.indices) {
//            if (2 * sum + nums[i] == total) {
//                return i
//            }
//            sum += nums[i]
//        }
//        return -1
//    }
//}