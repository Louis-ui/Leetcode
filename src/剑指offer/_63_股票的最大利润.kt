package 剑指offer


class _63_股票的最大利润 {
}

//class Solution {
//    fun maxProfit(prices: IntArray): Int {
//        if (prices.isEmpty()) return 0
//        var min = Int.MAX_VALUE
//        var profit = 0
//        for (i in prices.indices) {
//            if (prices[i] < min) {
//                min = prices[i]
//            } else if (prices[i] - min > profit) {
//                profit = prices[i] - min
//            }
//        }
//        return profit
//    }
//}