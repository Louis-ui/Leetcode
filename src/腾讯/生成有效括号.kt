package 腾讯


class 生成有效括号 {
}

//class Solution {
//    fun generateParenthesis(n: Int): List<String> {
//        val ans: MutableList<String> = ArrayList()
//        backtrack(ans, StringBuilder(), 0, 0, n)
//        return ans
//    }
//
//    fun backtrack(ans: MutableList<String>, cur: StringBuilder, open: Int, close: Int, max: Int) {
//        if (cur.length == max * 2) {
//            ans.add(cur.toString())
//            return
//        }
//        if (open < max) {
//            cur.append('(')
//            backtrack(ans, cur, open + 1, close, max)
//            cur.deleteCharAt(cur.length - 1)
//        }
//        if (close < open) {
//            cur.append(')')
//            backtrack(ans, cur, open, close + 1, max)
//            cur.deleteCharAt(cur.length - 1)
//        }
//    }
//}
//
//class Solution {
//    fun generateParenthesis(n: Int): List<String> {
//        val ans: MutableList<String> = ArrayList()
//        backtrack(ans, StringBuilder(), n, n)
//        return ans
//    }
//
//    fun backtrack(ans: MutableList<String>, cur: StringBuilder, open: Int, close: Int) {
//        if (open<0||close<0) return
//        if (close<open)return
//        if (open == 0 && close == 0) {
//            ans.add(cur.toString())
//            return
//        }
//
//        cur.append('(')
//        backtrack(ans, cur, open - 1, close)
//        cur.deleteCharAt(cur.length - 1)
//
//
//        cur.append(')')
//        backtrack(ans, cur, open, close - 1)
//        cur.deleteCharAt(cur.length - 1)
//
//    }
//}