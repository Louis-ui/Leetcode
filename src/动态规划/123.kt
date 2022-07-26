package 动态规划

class `123` {

    fun jump(i: Int): Int {
        if (i == 0) return 1
        if (i == 1) return 1
        if (i == 2) return 2
        val dp = IntArray(i + 1)
        dp[0] = 1
        dp[1] = 1
        dp[2] = 2
        for (j in 3..i) {
            dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3]
        }
        return dp[i]
    }

}

fun main() {
    var a = `123`()
    print(a.jump(8))
}

internal class Solution {
    fun numWays(n: Int): Int {
        if (n == 0) return 1
        if (n == 1) return 1
        val dp = IntArray(n + 1)
        dp[0] = 1
        dp[1] = 1
        for (i in 2..n) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007
        }
        return dp[n]
    }
}