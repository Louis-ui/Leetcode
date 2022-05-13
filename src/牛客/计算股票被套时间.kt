package 牛客

class 计算股票被套时间 {
}

//object Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     *
//     * @param n int整型
//     * @param stocks int整型一维数组
//     * @return int整型一维数组
//     */
//    fun stocks(n: Int,stocks: IntArray): IntArray  {
//        var ans = IntArray(n)
//        for(i in 0 until  n){
//            var j = i
//            while (j<n && stocks[i]>= stocks[j]){
//                j++
//            }
//            if (j>=n) ans[i] = 0 else ans[i] = j-i
//        }
//        return ans
//
//    }
//}
//
//fun main() {
//    print(Solution.stocks(10, intArrayOf(11,15,16,12,8,16,18,17,11,10)))
//}