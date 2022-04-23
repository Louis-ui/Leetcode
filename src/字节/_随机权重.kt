package 字节

import java.util.*


class _随机权重 {
}

//class Solution(w: IntArray) {
//    var pre: IntArray
//    var total: Int
//    fun pickIndex(): Int {
//        val x = (Math.random() * total).toInt() + 1
//        return binarySearch(x)
//    }
//
//    private fun binarySearch(x: Int): Int {
//        var low = 0
//        var high = pre.size - 1
//        while (low < high) {
//            val mid = (high - low) / 2 + low
//            if (pre[mid] < x) {
//                low = mid + 1
//            } else {
//                high = mid
//            }
//        }
//        return low
//    }
//
//    init {
//        pre = IntArray(w.size)
//        pre[0] = w[0]
//        for (i in 1 until w.size) {
//            pre[i] = pre[i - 1] + w[i]
//        }
//        total = Arrays.stream(w).sum()
//    }
//}