package 娱乐


class 鸡蛋掉落 {
}

//class Solution {
//    fun superEggDrop(k: Int, n: Int): Int {
//        if (k == 1) return n
//        if (n == 0) return 0
//        var res : Int = Int.MAX_VALUE
//        for (i in 1 .. n+1 ){
//            res = Math.min(res,
//                Math.max(
//                superEggDrop(k , n - i),
//                    superEggDrop(k-1 , i-1)
//                )+1
//            )
//        }
//        return res
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    println(solution.superEggDrop(1,2))
//}

//class Solution {
//    fun superEggDrop(K: Int, N: Int): Int {
//
//        // K 行 N 列（鸡蛋的数目较少，作为行）
//        val dp = Array(K + 1) {
//            IntArray(N + 1) { -1 }
//        }
//
//        fun dp(K: Int, N: Int): Int {
//            // 1、边界测试用例
//            if (N <= 2) {
//                // 边界1. 空楼/一层楼/两层楼的情况
//                return N
//            }
//            if (K == 1) {
//                // 边界2. 只有一个鸡蛋，只能线性搜索
//                return N
//            }
//            if (K >= N) {
//                // 边界3，鸡蛋“充足”，使用二分搜索
//                return log2(N + 1) // 树的高度要能覆盖[0,N] 共 N + 1 个叶子节点
//            }
//            if (K == 0) {
//                // 边界4，没有鸡蛋
//                return 0
//            }
//
//            // 2、重叠子问题
//            if (-1 != dp[K][N]) {
//                return dp[K][N]
//            }
//            // 3、动态规划
//            var y_k_n = Integer.MAX_VALUE
//            for (i in 1..N) {
//                val y_i = Math.max(
//                    dp(K - 1, i - 1),// 碎 -> [1,i - 1]
//                    dp(K, N - i) // 没碎 -> [i - 1, N]
//                )
//                y_k_n = Math.min(y_k_n, y_i)
//            }
//            // 加一是因为划分子问题时丢了一次
//            return (y_k_n + 1).apply {
//                dp[K][N] = this
//            }
//        }
//        return dp(K, N)
//    }
//
////     以 2 为底的对数
//    private fun log2(n: Int) = Math.ceil(Math.log(n.toDouble()) / Math.log(2.0)).toInt() // 向上取整
//}
//
//fun main() {
//    var solution = Solution()
//    println(solution.superEggDrop(7,10000))
//}

//internal class Solution {
//    var memo: MutableMap<Int, Int> = HashMap()
//    fun superEggDrop(k: Int, n: Int): Int {
//        return dp(k, n)
//    }
//
//    fun dp(k: Int, n: Int): Int {
//        if (!memo.containsKey(n * 100 + k)) {
//            val ans: Int
//            if (n == 0) {
//                ans = 0
//            } else if (k == 1) {
//                ans = n
//            } else {
//                var lo = 1
//                var hi = n
//                while (lo + 1 < hi) {
//                    val x = (lo + hi) / 2
//                    val t1 = dp(k - 1, x - 1)
//                    val t2 = dp(k, n - x)
//                    if (t1 < t2) {
//                        lo = x
//                    } else if (t1 > t2) {
//                        hi = x
//                    } else {
//                        hi = x
//                        lo = hi
//                    }
//                }
//                ans =
//                    1 + Math.min(Math.max(dp(k - 1, lo - 1), dp(k, n - lo)), Math.max(dp(k - 1, hi - 1), dp(k, n - hi)))
//            }
//            memo[n * 100 + k] = ans
//        }
//        return memo[n * 100 + k]!!
//    }
//}


