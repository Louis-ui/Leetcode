package 腾讯


class _整数替换 {
}

//class Solution {
//    fun integerReplacement(n: Int): Int {
//        if (n == 1) {
//            return 0
//        }
//        return if (n % 2 == 0) {
//            1 + integerReplacement(n / 2)
//        } else 2 + Math.min(integerReplacement(n / 2), integerReplacement(n / 2 + 1))
//    }
//}
//
//class Solution {
//    var memo: MutableMap<Int, Int> = HashMap()
//    fun integerReplacement(n: Int): Int {
//        if (n == 1) {
//            return 0
//        }
//        if (!memo.containsKey(n)) {
//            if (n % 2 == 0) {
//                memo[n] = 1 + integerReplacement(n / 2)
//            } else {
//                memo[n] = 2 + Math.min(integerReplacement(n / 2), integerReplacement(n / 2 + 1))
//            }
//        }
//        return memo[n]!!
//    }
//}