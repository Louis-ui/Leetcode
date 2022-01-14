package 剑指offer

class `_10- I_斐波那契数列` {
}

//class Solution {
//    fun fib(n: Int): Int {
//        var a = 0
//        var b = 1
//        var sum: Int
//        for (i in 0 until n) {
//            sum = (a + b) % 1000000007
//            a = b
//            b = sum
//        }
//        return a
//    }
//}

class Solution {
    fun fib(n: Int): Int {
        if (n == 0) {
            return 0
        } else if (n == 1) {
            return 1
        } else {
            return fib(n - 1) + fib(n - 2)
        }
    }
}


//fun main() {
//    var solution = Solution()
//    print(solution.fib(44))
//}