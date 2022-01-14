package 数据结构


class _387_字符串中的第一个唯一字符 {
}

//class Solution {
//    fun firstUniqChar(s: String): Int {
//        val frequency: MutableMap<Char, Int> = HashMap()
//        for (i in 0 until s.length) {
//            val ch = s[i]
//            frequency[ch] = frequency.getOrDefault(ch, 0) + 1
//        }
//        for (i in 0 until s.length) {
//            if (frequency[s[i]] == 1) {
//                return i
//            }
//        }
//        return -1
//    }
//}