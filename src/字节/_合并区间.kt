package 字节

import java.util.*


class _合并区间 {
}

//class Solution {
//    fun merge(intervals: Array<IntArray>): Array<IntArray> {
//        for (i in intervals.indices) {
//            for (j in i + 1 until intervals.size) {
//                if (chechIfIn(intervals[i], intervals[j])) intervals[j] = null
//            }
//        }
//    }
//
//    fun chechIfIn(a: IntArray, b: IntArray): Boolean {
//        return (a[0] > b[0] && a[1] < b[1])
//    }
//
//}

//class Solution {
//    fun merge(intervals: Array<IntArray>): Array<IntArray> {
//        var ans = ArrayList<IntArray>()
//        var i = 0
//        var j = 1
//        while (j < intervals.size) {
//            var a = intervals[i]
//            var b = intervals[j]
//
//
//
//            if (a[0] <= b[0] && a[1] >= b[0] && a[1] <= b[1]) {
//                ans.add(intArrayOf(a[0], b[1]))
//
//            } else if (a[0] <= b[0] && a[1] >= b[0] && a[1] >= b[1] ) {
//                ans.add(intArrayOf(a[0], a[1]))
//
//            } else if (a[0] >= b[0] && a[1] >= b[0] && a[1] <= b[1]) {
//                ans.add(intArrayOf(b[0], b[1]))
//
//            } else if (a[0] >= b[0] && a[1] >= b[0] && a[1] >= b[1]) {
//                ans.add(intArrayOf(b[0], a[1]))
//
//            } else {
//                ans.add(intervals[i])
//                ans.add(intervals[j])
//            }
//            i += 2
//            j += 2
//        }
//        if (intervals.size == 1) ans.add(intervals[0])
//        var ansArray = Array<IntArray>(ans.size) { index -> intArrayOf() }
//        for (i in ans.indices) {
//            ansArray[i] = ans[i]
//        }
//        return ansArray
//    }
//}

//class Solution {
//    fun chechIfIn(a: IntArray, b: IntArray): IntArray {
//        if (a[0] < b[0] && a[1] > b[0] && a[1] < b[1]) {
//            return intArrayOf(a[0], b[1])
//        } else if (a[0] < b[0] && a[1] > b[0] && a[1] > b[1]) {
//            return intArrayOf(a[0], a[1])
//        } else if (a[0] > b[0] && a[1] > b[0] && a[1] < b[1]) {
//            return intArrayOf(b[0], b[1])
//        } else if (a[0] > b[0] && a[1] > b[0] && a[1] > b[1]) {
//            return intArrayOf(b[0], a[1])
//        }
//
//    }
//}

internal class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if (intervals.size == 0) {
            return Array(0) { IntArray(2) }
        }
        Arrays.sort(
            intervals
        ) { interval1, interval2 -> interval1[0] - interval2[0] }
        val merged: MutableList<IntArray> = ArrayList()
        for (i in intervals.indices) {
            val L = intervals[i][0]
            val R = intervals[i][1]
            if (merged.size == 0 || merged[merged.size - 1][1] < L) {
                merged.add(intArrayOf(L, R))
            } else {
                merged[merged.size - 1][1] = Math.max(merged[merged.size - 1][1], R)
            }
        }
        return merged.toTypedArray()
    }
}


