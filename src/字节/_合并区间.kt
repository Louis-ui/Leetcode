package 字节

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