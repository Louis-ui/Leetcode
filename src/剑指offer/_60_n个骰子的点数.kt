package 剑指offer

import java.util.*


class _60_n个骰子的点数 {
}

//class Solution {
//    fun dicesProbability(n: Int): DoubleArray {
//        var dp = DoubleArray(6)
//        Arrays.fill(dp, 1.0 / 6.0)
//        for (i in 2..n) {
//            val tmp = DoubleArray(5 * i + 1)
//            for (j in dp.indices) {
//                for (k in 0..5) {
//                    tmp[j + k] += dp[j] / 6.0
//                }
//            }
//            dp = tmp
//        }
//        return dp
//    }
//}
//
//class Solution {
//    fun dicesProbability(n: Int): DoubleArray {
//        var dp1 = DoubleArray(6)
//        Arrays.fill(dp1, 1.0 / 6.0)
//        var dp2 = DoubleArray(12)
//        for (i in dp2.indices) {
//            dp2[i] = dp1[i - 1] + dp1[i - 2] + dp1[i - 3] + dp1[i - 4] + dp1[i - 5] + dp1[i - 6]
//        }
//
//
//    }
//}
//
