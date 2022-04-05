package 牛客

class 最大值 {
}

//object Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     *
//     * @param s string字符串
//     * @param k int整型
//     * @return int整型
//     */
//    fun maxValue(s: String, k: Int): Int {
//        // write code here
//        if (s.length <= k) return s.toInt()
//        var max = 0
//        var left = 0
//        var right = 0
//        var window :String
//        while (right < s.length){
//            right++
//            while (right - left == k){
//                window = s.substring(left,right)
//                max = Math.max(max,window.toInt())
//                left++
//            }
//        }
//        return max
//    }
//}
//
//fun main() {
//    println(Solution.maxValue("123",1))
//}