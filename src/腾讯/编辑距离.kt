package 腾讯

class 编辑距离 {
}
//
//class Solution {
//    fun minDistance(word1: String, word2: String): Int {
//        return dp(word1,word2,word1.length-1,word2.length-1)
//    }
//
//    fun dp(word1: String, word2: String, i: Int, j: Int): Int {
//        if (i == -1 || j == -1) return 0
//        if (word1[i] == word2[j]) {
//            return dp(word1, word2, i-1, j-1)
//        } else {
//            return Math.min(dp(word1, word2, i-1, j)+1,Math.min(dp(word1, word2, i, j-1)+1,dp(word1, word2, i-1, j-1)+1))
//        }
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    println(solution.minDistance("rad","apple"))
//
//}
//
//fun minDistance(word1: String, word2: String): Int {
//    val m = word1.length
//    val n = word2.length
//    // 定义：s1[0..i] 和 s2[0..j] 的最小编辑距离是 dp[i+1][j+1]
//    val dp = Array(m + 1) { IntArray(n + 1) }
//    // base case
//    for (i in 1..m) dp[i][0] = i
//    for (j in 1..n) dp[0][j] = j
//    // 自底向上求解
//    for (i in 1..m) {
//        for (j in 1..n) {
//            if (word1[i - 1] == word2[j - 1]) {
//                dp[i][j] = dp[i - 1][j - 1]
//            } else {
//                dp[i][j] = min(
//                    dp[i - 1][j] + 1,
//                    dp[i][j - 1] + 1,
//                    dp[i - 1][j - 1] + 1
//                )
//            }
//        }
//    }
//    // 储存着整个 s1 和 s2 的最小编辑距离
//    return dp[m][n]
//}
//
//fun min(a: Int, b: Int, c: Int): Int {
//    return Math.min(a, Math.min(b, c))
//}