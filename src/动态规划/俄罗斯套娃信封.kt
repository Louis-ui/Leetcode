package 动态规划

import java.util.*


class 俄罗斯套娃信封 {
}

//class Solution {
//    fun maxEnvelopes(envelopes: Array<IntArray>): Int {
//        if (envelopes.isEmpty()) return 0
//        Arrays.sort(envelopes
//        ) { o1, o2 -> if (o1!![0] == o2!![0]) o2[1] - o1[1] else o1[0] - o2[0] }
//
////        val c = Comparator{intArray1: IntArray, intArray2: IntArray -> intArray1[0] - intArray2[0]}
////        envelopes.sortedWith(c)
//        val nums = IntArray(envelopes.size)
//        for (i in envelopes.indices) {
//            nums[i] = envelopes[i][1]
//        }
//        return lengthOfLIS(nums)
//    }
//
//    fun lengthOfLIS(nums: IntArray): Int {
//        if (nums.isEmpty()) {
//            return 0
//        }
//        val dp = IntArray(nums.size)
//        dp[0] = 1
//        var maxans = 1
//        for (i in 1 until nums.size) {
//            dp[i] = 1
//            for (j in 0 until i) {
//                if (nums[i] > nums[j]) {
//                    dp[i] = Math.max(dp[i], dp[j] + 1)
//                }
//            }
//            maxans = Math.max(maxans, dp[i])
//        }
//        return maxans
//    }
//}
//
//
//internal class Solution {
//    fun maxEnvelopes(envelopes: Array<IntArray>): Int {
//        if (envelopes.size == 0) {
//            return 0
//        }
//        val n = envelopes.size
//        Arrays.sort(envelopes) { e1, e2 ->
//            if (e1[0] != e2[0]) {
//                e1[0] - e2[0]
//            } else {
//                e2[1] - e1[1]
//            }
//        }
//        val f = IntArray(n)
//        Arrays.fill(f, 1)
//        var ans = 1
//        for (i in 1 until n) {
//            for (j in 0 until i) {
//                if (envelopes[j][1] < envelopes[i][1]) {
//                    f[i] = Math.max(f[i], f[j] + 1)
//                }
//            }
//            ans = Math.max(ans, f[i])
//        }
//        return ans
//    }
//}
//
//fun main() {
//    var sc = Scanner(System.`in`)
//    val total = sc.nextInt()
//    val envelopes = Array(total) { IntArray(2) { 0 } }
//    for (i in 0 until total) {
//        envelopes[i][0] = sc.nextInt()
//        envelopes[i][1] = sc.nextInt()
//    }
//    if (envelopes.isEmpty()) print(0)
//    val n = envelopes.size
//    Arrays.sort(envelopes) { e1, e2 ->
//        if (e1[0] != e2[0]) {
//            e1[0] - e2[0]
//        } else {
//            e2[1] - e1[1]
//        }
//    }
//    val f = IntArray(n)
//    Arrays.fill(f, 1)
//    var ans = 1
//    for (i in 1 until n) {
//        for (j in 0 until i) {
//            if (envelopes[j][1] < envelopes[i][1]) {
//                f[i] = Math.max(f[i], f[j] + 1)
//            }
//        }
//        ans = Math.max(ans, f[i])
//    }
//    print(ans)
//
//}