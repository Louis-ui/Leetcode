package 娱乐



class 让字符串成为回文串的最少插入次数 {
}

//class Solution {
//    fun minInsertions(s: String): Int {
//        val length = s.length
//        var dp = Array(length) {
//            IntArray(length) { 0 }
//        }
//        for (i in length-2 downTo 0) {
//            for (j in i + 1 until length) {
//                if (s[i] == s[j]) {
//                    dp[i][j] = dp[i + 1][j - 1]
//                } else {
//                    dp[i][j] = Math.min(dp[i][j - 1], dp[i + 1][j]) + 1
//                }
//            }
//        }
//        return dp[0][length - 1]
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    println(solution.minInsertions("abcdefg"))
//}