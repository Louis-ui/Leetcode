package 未分类

class _813_最大平均值和的分组 {
}

//class Solution {
//    fun largestSumOfAverages(nums: IntArray, k: Int): Double {
//        for (i in )
//    }
//}

//class Solution {
//    fun largestSumOfAverages(A: IntArray, K: Int): Double {
//        val N = A.size
//        val P = DoubleArray(N + 1)
//        for (i in 0 until N) P[i + 1] = P[i] + A[i]
//        val dp = DoubleArray(N)
//        for (i in 0 until N) dp[i] = (P[N] - P[i]) / (N - i)
//        for (k in 0 until K - 1) for (i in 0 until N) for (j in i + 1 until N) dp[i] =
//            Math.max(dp[i], (P[j] - P[i]) / (j - i) + dp[j])
//        return dp[0]
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.largestSumOfAverages(intArrayOf(9, 1, 2, 3, 9), 3)
//}


