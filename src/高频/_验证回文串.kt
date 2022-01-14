package 高频

class _验证回文串 {
}

//internal class Solution {
//    fun isPalindrome(s: String): Boolean {
//        val sgood = StringBuffer()
//        val length = s.length
//        for (i in 0 until length) {
//            val ch = s[i]
//            if (Character.isLetterOrDigit(ch)) {
//                sgood.append(Character.toLowerCase(ch))
//            }
//        }
//        val n = sgood.length
//        var left = 0
//        var right = n - 1
//        while (left < right) {
//            if (Character.toLowerCase(sgood[left]) != Character.toLowerCase(sgood[right])) {
//                return false
//            }
//            ++left
//            --right
//        }
//        return true
//    }
//}

//class Solution {
//    fun isPalindrome(s: String): Boolean {
//        var s = s.toLowerCase()
//        var i = 0
//        var j = s.length - 1
//        while (s[i] == s[j] && i < j) {
//            i++
//            j--
//            if (s[i] == ' ') i++
//            if (s[j] == ' ') j--
//            if (i > j) {
//                return true
//            }
//        }
//        return false
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.isPalindrome("A man, a plan, a canal: Panama")
//}