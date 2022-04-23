package 腾讯

class 最长子穿 {
}

//class Solution {
//    fun lengthOfLongestSubstring(s: String): Int {
//        if (s.isEmpty()) return 0
//        var hashSet = HashSet<Char>()
//        var dp = IntArray(s.length) { 1 }
//        for (i in 1 until s.length){
//
//            if (hashSet.contains(s[i])){
//                dp[i] = dp[i-1]
//            }else{
//                dp[i] = dp[i-1]+1
//            }
//        }
//    }
//}