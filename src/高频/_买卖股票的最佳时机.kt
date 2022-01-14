package 高频

class _买卖股票的最佳时机 {
}

//class Solution {
//    fun maxProfit(prices: IntArray): Int {
//        var res = Int.MIN_VALUE
//        val n = prices.size
//        var min = Int.MAX_VALUE
//        for (i in 0 until n) {
//            min = Math.min(min, prices[i])
//            res = Math.max(res, prices[i] - min)
//        }
//        return if (res > 0) res else 0
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.maxProfit(intArrayOf(7,6,4,3,1))
//}

//class Solution {
////    fun maxProfit(prices: IntArray): Int {
////        var max = 0
////        for (i in prices.indices) {
////            for (k in i until prices.size) {
////                max = Math.max(max, (prices[k] - prices[i]))
////            }
////        }
////        return max
////    }
//
//    fun maxProfit(prices: IntArray): Int {
//        var min = 0
//        var minX = 0
//        for (i in prices.indices) {
//            min = Math.min(min, prices[i])
//            minX = i
//        }
//
//
//    }
//}

//class Solution {
//    fun maxProfit(prices: IntArray): Int {
//        val len = prices.size
//        // 特殊判断
//        if (len < 2) {
//            return 0
//        }
//        val dp = Array(len) { IntArray(2) }
//
//        // dp[i][0] 下标为 i 这天结束的时候，不持股，手上拥有的现金数
//        // dp[i][1] 下标为 i 这天结束的时候，持股，手上拥有的现金数
//
//        // 初始化：不持股显然为 0，持股就需要减去第 1 天（下标为 0）的股价
//        dp[0][0] = 0
//        dp[0][1] = -prices[0]
//
//        // 从第 2 天开始遍历
//        for (i in 1 until len) {
//            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i])
//            dp[i][1] = Math.max(dp[i - 1][1], -prices[i])
//        }
//        return dp[len - 1][0]
//    }
//}