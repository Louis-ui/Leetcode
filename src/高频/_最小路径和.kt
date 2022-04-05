package 高频

class _最小路径和 {
}

class Solution {
    fun minPathSum(grid: Array<IntArray>?): Int {
        if (grid == null || grid.size == 0 || grid[0].size == 0) {
            return 0
        }
        val rows = grid.size
        val columns = grid[0].size
        val dp = Array(rows) { IntArray(columns) }
        dp[0][0] = grid[0][0]
        for (i in 1 until rows) {
            dp[i][0] = dp[i - 1][0] + grid[i][0]
        }
        for (j in 1 until columns) {
            dp[0][j] = dp[0][j - 1] + grid[0][j]
        }
        for (i in 1 until rows) {
            for (j in 1 until columns) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j]
            }
        }
        return dp[rows - 1][columns - 1]
    }
}