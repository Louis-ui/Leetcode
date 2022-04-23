package 高频

import java.util.*


class _滑动窗口的最大值 {
}

//class Solution {
//    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
//        var left = 0
//        var right = 0
//        while (right <k-2){
//
//            nums[right]
//
//            right++
//        }
//    }
//}
//
//internal class Solution {
//    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
//        val n = nums.size
//        val deque: Deque<Int> = LinkedList()
//        for (i in 0 until k) {
//            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
//                deque.pollLast()
//            }
//            deque.offerLast(i)
//        }
//        val ans = IntArray(n - k + 1)
//        ans[0] = nums[deque.peekFirst()]
//        for (i in k until n) {
//            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
//                deque.pollLast()
//            }
//            deque.offerLast(i)
//            while (deque.peekFirst() <= i - k) {
//                deque.pollFirst()
//            }
//            ans[i - k + 1] = nums[deque.peekFirst()]
//        }
//        return ans
//    }
//}