package 高频

class _最长回文子串 {
}

//class Solution {
//    fun longestPalindrome(s: String): String {
//        var res: String = ""
//        for (i in s.indices) {
//            val s1 = palindrome(s,i,i)
//            val s2 = palindrome(s,i,i+1)
//            if (res.length>s1.length) {
//                res = res
//            } else {
//                res = s1
//            }
//            if (res.length>s2.length) {
//                res = res
//            } else {
//                res = s2
//            }
//        }
//        return res
//    }
//
//    fun palindrome(s: String, l: Int, r: Int): String {
//        var l = l
//        var r = r
//        while (l >= 0 && r < s.length && s[l] == s[r]) {
//            l--
//            r++
//        }
//        return s.substring(l+1,r-l-1)
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.longestPalindrome("babad")
//}
//
//internal class Solution {
//    fun longestPalindrome(s: String?): String {
//        if (s == null || s.length < 1) {
//            return ""
//        }
//        var start = 0
//        var end = 0
//        for (i in 0 until s.length) {
//            val len1 = expandAroundCenter(s, i, i)
//            val len2 = expandAroundCenter(s, i, i + 1)
//            val len = Math.max(len1, len2)
//            if (len > end - start) {
//                start = i - (len - 1) / 2
//                end = i + len / 2
//            }
//        }
//        return s.substring(start, end + 1)
//    }
//
//    fun expandAroundCenter(s: String, left: Int, right: Int): Int {
//        var left = left
//        var right = right
//        while ((left >= 0) && (right < s.length) && (s[left] == s[right])) {
//            --left
//            ++right
//        }
//        return right - left - 1
//    }
//}