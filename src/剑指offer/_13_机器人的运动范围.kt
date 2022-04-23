package 剑指offer

class _13_机器人的运动范围 {
}

//class Solution {
//    fun movingCount(m: Int, n: Int, k: Int): Int {
//        var ans = 0
////        var table = Array(m) { index -> Array(n) { 0 } }
//        for (i in 0 until m) {
//            for (j in 0 until n) {
//                if (check(i, j, k)) ans++
////                dfs(m, n, i, j, k, ans)
//            }
//        }
//        return ans
//    }
//
//    private fun dfs(m: Int, n: Int, i: Int, j: Int, k: Int, ans: Int): Boolean {
//
//        if (i < 0 || j < 0 || i >= m || j >= n || check(i, j, k)) return false
//        var result = dfs(m, n, i + 1, j, k, ans) ||
//                dfs(m, n, i - 1, j, k, ans) ||
//                dfs(m, n, i, j + 1, k, ans) ||
//                dfs(m, n, i, j - 1, k, ans)
//    }
//
//    private fun check(i: Int, j: Int, k: Int): Boolean {
//        var ic = i.toString().toCharArray()
//        var jc = j.toString().toCharArray()
//        var ilist = 0
//        var jlist = 0
//        for (i in ic) {
//            ilist += i.toString().toInt()
//        }
//        for (j in jc) {
//            jlist += j.toString().toInt()
//        }
//        return (jlist + ilist) <= k
//    }
//}
//
//internal class Solution {
//    fun movingCount(m: Int, n: Int, k: Int): Int {
//        val visited = Array(m) { BooleanArray(n) }
//        return dfs(0, 0, m, n, k, visited)
//    }
//
//    private fun dfs(i: Int, j: Int, m: Int, n: Int, k: Int, visited: Array<BooleanArray>): Int {
//        if (i < 0 || i >= m || j < 0 || j >= n || i / 10 + i % 10 + j / 10 + j % 10 > k || visited[i][j]) {
//            return 0
//        }
//        visited[i][j] = true
//        return dfs(i + 1, j, m, n, k, visited) +
//                dfs(i, j + 1, m, n, k, visited) + 1
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    println(solution.movingCount(16, 8, 4))
//}