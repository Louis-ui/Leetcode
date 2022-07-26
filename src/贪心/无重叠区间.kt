package 贪心

import java.util.*


class 无重叠区间 {
}

//class Solution {
//    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
//        if (intervals.isEmpty()) {
//            return 0
//        }
//        Arrays.sort(
//            intervals
//        ) { interval1, interval2 -> interval1[0] - interval2[0] }
//        val n = intervals.size
//        val f = IntArray(n)
//        Arrays.fill(f, 1)
//        for (i in 1 until n) {
//            for (j in 0 until i) {
//                if (intervals[j][1] <= intervals[i][0]) {
//                    f[i] = Math.max(f[i], f[j] + 1)
//                }
//            }
//        }
//        return n - Arrays.stream(f).max().asInt
//    }
//
//    fun aAnotherWayToReturnFalse(): Boolean {
//
//    }
//}
//
//fun main() {
//    var s = Solution()
////    s.eraseOverlapIntervals(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(1, 3)))
//    print(s.aAnotherWayToReturnFalse())
//}