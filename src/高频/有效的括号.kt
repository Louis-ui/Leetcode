package 高频

import java.util.*


class 有效的括号 {
}

//class Solution {
//    fun isValid(s: String): Boolean {
//        val n = s.length
//        if (n % 2 == 1) {
//            return false
//        }
//        val pairs: HashMap<Char?, Char?> = object : HashMap<Char?, Char?>() {
//            init {
//                put(')', '(')
//                put(']', '[')
//                put('}', '{')
//            }
//        }
//        val stack: Deque<Char> = LinkedList()
//        for (i in 0 until n) {
//            val ch = s[i]
//            if (pairs.containsKey(ch)) {
//                if (stack.isEmpty() || stack.peek() !== pairs[ch]) {
//                    return false
//                }
//                stack.pop()
//            } else {
//                stack.push(ch)
//            }
//        }
//        return stack.isEmpty()
//    }
//}

//class Solution {
//    fun isValid(s: String): Boolean {
//        if (s.isEmpty()) return true
//        var stack = Stack<Char>()
//
//        val pairs: HashMap<Char?, Char?> = object : HashMap<Char?, Char?>() {
//            init {6
//                put(')', '(')
//                put(']', '[')
//                put('}', '{')
//            }
//        }
//
//        for (i in s.indices) {
//            if (s[i] == '(' || s[i] == '[' || s[i] == '{') {
//                stack.push(s[i])
//            }
//            val c = stack.peek()
//            if (c == pairs[c]) {
//                stack.pop()
//            }
//        }
//        return stack.isEmpty()
//    }
//}


//fun main() {
//    var solution = Solution()
//    solution.isValid("()")
//}