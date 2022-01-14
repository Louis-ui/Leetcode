package 娱乐

class _快乐字符串 {
}

//class Solution {
//    var ans = ""
//
//    fun longestDiverseString(a: Int, b: Int, c: Int): String {
//        var max = 0
//        var mid = 0
//        var min = 0
//        max = Math.max(a, b)
//        min = Math.min(a, b)
//        if (max > c) {
//            if (min > c) {
//                mid = min
//                min = c
//            } else {
//                mid = c
//            }
//        } else {
//            mid = max
//            max = c
//        }
//        val omax = max
//        val omid = mid
//        val omin = mid
//        while (max > 0) {
//            addTwoString(a, b, c, omax)
//            max -= 2
//            if (mid > 0) {
//                addString(a,b,c,omid)
//                mid - 1
//            } else if (mid > 0) {
//                addString(a,b,c,omin)
//                min - 1
//            }
//        }
//        while (mid > 0) {
//            addTwoString(a,b,c,omid)
//            mid -= 2
//            if (mid > 0) {
//                addString(a,b,c,omin)
//                min - 1
//            }
//        }
//        return ans
//    }
//
//    fun addTwoString(a: Int, b: Int, c: Int, input: Int) {
//        when (input) {
//            a -> ans + "aa"
//            b -> ans + "bb"
//            c -> ans + "cc"
//        }
//    }
//
//    fun addString(a: Int, b: Int, c: Int, input: Int) {
//        when (input) {
//            a -> ans + "a"
//            b -> ans + "b"
//            c -> ans + "c"
//        }
//    }
//}