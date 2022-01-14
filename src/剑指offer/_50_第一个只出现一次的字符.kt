package 剑指offer

class _50_第一个只出现一次的字符 {
}

//class Solution {
//    fun firstUniqChar(s: String): Char {
//        val frequency:MutableMap<Char, Int> = mutableMapOf()
//        for (i in s.indices) {
//            val ch:Char = s[i]
//            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1)
//        }
//        for (i in s.indices) {
//            if (frequency.get(s[i]) == 1) {
//                return s[i]
//            }
//        }
//        return ' '
//    }
//}