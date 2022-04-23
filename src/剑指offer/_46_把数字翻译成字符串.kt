package 剑指offer

class _46_把数字翻译成字符串 {
}

//class Solution {
//    fun translateNum(num: Int): Int {
//        var s = num.toString()
//        var len = s.length
//        if (len<2) return len
//        var charArray = s.toCharArray()
//        var dp = Array<Int>(len)
//        dp[0] = 1
//        for (i in 1 until len){
//            dp[i] = dp[i-1]
//        }
//    }
//}