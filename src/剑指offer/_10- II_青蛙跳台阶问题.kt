package 剑指offer

class `_10- II_青蛙跳台阶问题` {
}

//class Solution {
//    fun numWays(n: Int): Int {
//       for (i in 1 until n)
//           print(i)
//
//    }
//}

//fun main() {
//    var solution = Solution()
//    print(solution.numWays(4))
//}
//
//class Solution {
//
//    lateinit var array: IntArray
//    fun numWays(n: Int): Int {
//        if (n == 0) return 1
//        if (!this::array.isInitialized) {
//            var realArray = IntArray(n + 1)
//            array = realArray
//        }
//        if (n == 1) return 1
//        if (n == 2) return 2
//        if (array[n] != 0) return array[n]
//        var a = numWays(n - 1)
//        var b = numWays(n - 2)
//        return a + b
//    }
//}