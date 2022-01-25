package 娱乐

import java.util.*


class `查找和最小的 K 对数字` {
}


//class Solution {
//    fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
//        var k = k
//        val pq = PriorityQueue(k) { o1: IntArray, o2: IntArray -> nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]] }
//        val ans: MutableList<List<Int>> = ArrayList()
//        val m = nums1.size
//        val n = nums2.size
//
//
//
//        for (i in 0 until Math.min(m, k)) {
//            pq.offer(intArrayOf(i, 0))
//        }
//        while (k-- > 0 && !pq.isEmpty()) {
//            val idxPair = pq.poll()
//            val list: MutableList<Int> = ArrayList()
//            list.add(nums1[idxPair[0]])
//            list.add(nums2[idxPair[1]])
//            ans.add(list)
//            if (idxPair[1] + 1 < n) {
//                pq.offer(intArrayOf(idxPair[0], idxPair[1] + 1))
//            }
//        }
//        return ans
//    }
//}