package 高频

class _分割等和子集 {
}

class Solution {
    fun canPartition(nums: IntArray): Boolean {
        var sum = 0
        for (i in nums) {
            sum += i
        }
        if (sum % 2 != 0) return false
        val n = nums.size
        sum = (sum / 2)
        val dp = Array<BooleanArray>(n + 1) { BooleanArray(sum+1){false} }
        for (i in dp.indices){
            dp[i][0] = true
        }
        for (i in 1 .. n){
            for (j in 1 .. sum){
                if (j-nums[i-1]<0){
                    dp[i][j] = dp[i-1][j]
                }else{
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]]
                }
            }
        }
        return dp[n][sum]
    }
}