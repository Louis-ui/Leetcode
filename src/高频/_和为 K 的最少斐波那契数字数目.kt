package 高频

class `_和为 K 的最少斐波那契数字数目` {
}

//class Solution {
//    fun findMinFibonacciNumbers(k: Int): Int {
//        var dp = ArrayList<Int>(10)
//        dp[0] = 1
//        dp[1] = 1
//        var temp = 2
//        while (dp[dp.size-1]<Int.MAX_VALUE){
//            dp[temp] = dp[temp-1]+dp[temp-2]
//            temp++
//        }
//        return 1
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.findMinFibonacciNumbers(1)
//}