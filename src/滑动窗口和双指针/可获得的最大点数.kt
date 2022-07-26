package 滑动窗口和双指针

import java.util.*


class 可获得的最大点数 {
}

//class Solution {
//    fun maxScore(cardPoints: IntArray, k: Int): Int {
//        if (cardPoints.isEmpty()) return 0
//        var ans = 0
//        var left = 0
//        var right = cardPoints.size-1
//        var i = 0
//        while (left<=right && i<k){
//            if (cardPoints[left]>cardPoints[right]){
//                ans+=cardPoints[left]
//                left++
//            }else{
//                ans+=cardPoints[right]
//                right--
//            }
//            i++
//        }
//        return ans
//    }
//}
//
//internal class Solution {
//    fun maxScore(cardPoints: IntArray, k: Int): Int {
//        val n = cardPoints.size
//        // 滑动窗口大小为 n-k
//        val windowSize = n - k
//        // 选前 n-k 个作为初始值
//        var sum = 0
//        for (i in 0 until windowSize) {
//            sum += cardPoints[i]
//        }
//        var minSum = sum
//        for (i in windowSize until n) {
//            // 滑动窗口每向右移动一格，增加从右侧进入窗口的元素值，并减少从左侧离开窗口的元素值
//            sum += cardPoints[i] - cardPoints[i - windowSize]
//            minSum = Math.min(minSum, sum)
//        }
//        return Arrays.stream(cardPoints).sum() - minSum
//    }
//}