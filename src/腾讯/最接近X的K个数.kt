package 腾讯

import java.util.*
import java.util.stream.Collectors


class 最接近X的K个数 {
}

//class Solution {
//    fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
//        val ans = ArrayList<Int>()
//        if (x <= arr[0]) {
//            for (i in 0 until k) {
//                ans.add(arr[i])
//            }
//            return ans
//        } else if (x >= arr[arr.size - 1]) {
//            for (i in arr.size - 1 downTo arr.size - 1 - k) {
//                ans.add(arr[i])
//            }
//            return ans
//        }
//        var left = 0
//        var right = arr.size - 1
//        while (left < right) {
//            val mid = left + (right - left) / 2
//            if (arr[mid] > x) {
//                right = mid
//            } else {
//                left = mid + 1
//            }
//        }
//
//
//    }
//}
//
//class Solution {
//    fun findClosestElements(arr: IntArray?, k: Int, x: Int): List<Int> {
//        val ret = Arrays.stream(arr).boxed().collect(Collectors.toList())
//        val n = ret.size
//        return if (x <= ret[0]) {
//            ret.subList(0, k)
//        } else if (ret[n - 1] <= x) {
//            ret.subList(n - k, n)
//        } else {
//            var index = Collections.binarySearch(ret, x)
//            if (index < 0) index = -index - 1
//            var low = Math.max(0, index - k - 1)
//            var high = Math.min(ret.size - 1, index + k - 1)
//            while (high - low > k - 1) {
//                if (x - ret[low] <= ret[high] - x) high-- else if (x - ret[low] > ret[high] - x) low++ else println(
//                    "unhandled case: $low $high"
//                )
//            }
//            ret.subList(low, high + 1)
//        }
//    }
//}