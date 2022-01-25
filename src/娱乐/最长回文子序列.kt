package 娱乐

class 最长回文子序列 {
}

class Solution {
    fun longestPalindromeSubseq(s: String): Int {
        val length = s.length
        var dp = Array(length) {
            IntArray(length) { 0 }
        }
        for (k in 0 until length) {
            dp[k][k] = 1
        }
        var i = 0
        var j = 1
        for (l in 2 .. length){
                while (j != length) {
                    if (s[i] == s[j]) {
                        dp[i][j] = dp[i + 1][j - 1] + 2
                    } else {
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j])
                    }

                    i++
                    j++
                }
                i = 0
                j = l

        }
        return dp[0][length - 1]
    }

}

fun main() {
    var solution = Solution()
    solution.longestPalindromeSubseq("bbbab")
}