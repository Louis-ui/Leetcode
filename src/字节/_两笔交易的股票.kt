package 字节

class _两笔交易的股票 {
}


//internal class Solution {
//    fun maxProfit(prices: IntArray): Int {
//        val n = prices.size
//        var buy1 = -prices[0]
//        var sell1 = 0
//        var buy2 = -prices[0]
//        var sell2 = 0
//        for (i in 1 until n) {
//            buy1 = Math.max(buy1, -prices[i])
//            sell1 = Math.max(sell1, buy1 + prices[i])
//            buy2 = Math.max(buy2, sell1 - prices[i])
//            sell2 = Math.max(sell2, buy2 + prices[i])
//        }
//        return sell2
//    }
//}
