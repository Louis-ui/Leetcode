package 牛客

class 字符串指定字符反转 {
}

//object Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     *
//     * @param s1 string字符串
//     * @param s2 string字符串
//     * @return string字符串
//     */
//    fun reverse(s1: String, s2: String): String {
//        // write code here
//        var left = 0
//        var right = 0
//        var window: String
//        val stringBuffer = StringBuffer()
//        while (right < s1.length && right - left < s2.length) {
//            right++
//            while (right - left == s2.length && stringBuffer.isBlank()) {
//                window = s1.substring(left, right)
//                if (window == s2) {
//                    val before = s1.substring(0, left)
//                    val after = s1.substring(right, s1.length)
//                    stringBuffer.append(before)
//                    val stringBuffer2 = StringBuffer()
//                    for (i in s2.length - 1 downTo 0) {
//                        stringBuffer2.append(s2[i])
//                    }
//                    stringBuffer.append(stringBuffer2.toString())
//                    stringBuffer.append(after)
//                } else {
//                    left++
//                }
//            }
//        }
//        return stringBuffer.toString()
//    }
//
//}
//
//fun main() {
//    println(Solution.reverse("acbde","dc"))
//}