package DFS

class 字母大小写全排列 {
}

//class Solution {
//    fun letterCasePermutation(s: String): List<String> {
//        if (s.isEmpty()) return ArrayList<String>()
//        val ans = ArrayList<String>()
//        backtrack(0, s, ans, StringBuffer())
//        return ans
//    }
//
//
//    private fun backtrack(current: Int, s: String, ans: ArrayList<String>, currentS: StringBuffer) {
//        if (currentS.toString().length == s.length) {
//            ans.add(currentS.toString())
//            return
//        }
//        if (s[current] in 'A'..'z') {
//            val newStringBufferUp = currentS.append(s[current].toUpperCase())
//            backtrack(current + 1, s, ans, newStringBufferUp)
//            currentS.deleteCharAt(currentS.length - 1)
//            val newStringBufferDown = currentS.append(s[current].toLowerCase())
//            backtrack(current + 1, s, ans, newStringBufferDown)
//            currentS.deleteCharAt(currentS.length - 1)
//        } else {
//            val newStringBufferNumber = currentS.append(s[current])
//            backtrack(current + 1, s, ans, newStringBufferNumber)
//            currentS.deleteCharAt(currentS.length - 1)
//        }
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.letterCasePermutation("a1b2")
//}