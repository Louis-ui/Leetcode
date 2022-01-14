package 高频

class _合并两个有序数组 {
}

//class Solution {
//    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
//        var m = m
//        for (i in nums2){
//            nums1[m] = i
//            m++
//        }
//        Arrays.sort(nums1)
//    }
//}

//internal class Solution {
//    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
//        var p1 = 0
//        var p2 = 0
//        val sorted = IntArray(m + n)
//        var cur: Int
//        while (p1 < m || p2 < n) {
//            cur = if (p1 == m) {
//                nums2[p2++]
//            } else if (p2 == n) {
//                nums1[p1++]
//            } else if (nums1[p1] < nums2[p2]) {
//                nums1[p1++]
//            } else {
//                nums2[p2++]
//            }
//            sorted[p1 + p2 - 1] = cur
//        }
//        for (i in 0 until m + n) {
//            nums1[i] = sorted[i]
//        }
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
//}