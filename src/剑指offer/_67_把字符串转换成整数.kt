package 剑指offer

class _67_把字符串转换成整数 {
}

//class Solution {
//
//    var res = 0
//    var sign = 1
//
//    fun strToInt(str: String): Int {
//        val s = str.trim()
//        for (i in s) {
//            when (true) {
//                i == '-' -> sign = -sign
//                (i < '0' || i > '9' ) && res!=0 -> return 0
//                res > Int.MAX_VALUE / 10 || res == Int.MAX_VALUE / 10 && i > '7' -> return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
//                i in '0'..'9' -> res = res * 10 + (i - '0')
//            }
//        }
//        return sign * res
//    }
//
//}
//
//internal class Solution {
//    fun strToInt(str: String): Int {
//        val c = str.trim { it <= ' ' }.toCharArray()
//        if (c.isEmpty()) return 0
//        var res = 0
//        val bndry = Int.MAX_VALUE / 10
//        var i = 1
//        var sign = 1
//        if (c[0] == '-') sign = -1 else if (c[0] != '+') i = 0
//        for (j in i until c.size) {
//            if (c[j] < '0' || c[j] > '9') break
//            if (res > bndry || res == bndry && c[j] > '7') return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
//            res = res * 10 + (c[j] - '0')
//        }
//        return sign * res
//    }
//}
