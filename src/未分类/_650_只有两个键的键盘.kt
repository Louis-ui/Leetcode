package 未分类

class _650_只有两个键的键盘 {
}

//class Solution {
//    fun minSteps(n: Int): Int {
//
//    }
//}

//internal class Solution {
//    fun minSteps(n: Int): Int {
//        val f = IntArray(n + 1)
//        for (i in 2..n) {
//            f[i] = Int.MAX_VALUE
//            var j = 1
//            while (j * j <= i) {
//                if (i % j == 0) {
//                    f[i] = Math.min(f[i], f[j] + i / j)
//                    f[i] = Math.min(f[i], f[i / j] + j)
//                }
//                ++j
//            }
//        }
//        return f[n]
//    }
//}