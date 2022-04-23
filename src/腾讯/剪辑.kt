package 腾讯

import java.util.*


class 剪辑 {
}

//class Solution {
//    fun videoStitching(clips: Array<IntArray>, time: Int): Int {
//        val dp = IntArray(time + 1) { Int.MAX_VALUE - 1 }
//        dp[0] = 0
//        for (i in 1..time) {
//            for (clip in clips) {
//                if (clip[0] < i && i <= clip[1]) {
//                    dp[i] = Math.min(dp[i], dp[clip[0]] + 1)
//                }
//            }
//        }
//        return if (dp[time] == Int.MAX_VALUE - 1) -1 else dp[time]
//    }
//
//
//}