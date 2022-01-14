package 剑指offer

class `_58 - I_翻转单词顺序` {
}

//class Solution {
//    fun reverseWords(s: String): String {
//        var s = s
//        s = s.trim { it <= ' ' } // 删除首尾空格
//        var j = s.length - 1
//        var i = j
//        val res = StringBuilder()
//        while (i >= 0) {
//            while (i >= 0 && s[i] != ' ') i-- // 搜索首个空格
//            res.append(s.substring(i + 1, j + 1) + " ") // 添加单词
//            while (i >= 0 && s[i] == ' ') i-- // 跳过单词间空格
//            j = i // j 指向下个单词的尾字符
//        }
//        return res.toString().trim { it <= ' ' } // 转化为字符串并返回
//    }
//}