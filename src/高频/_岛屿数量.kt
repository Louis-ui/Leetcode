package 高频

class _岛屿数量 {
}

//class Solution {
//    var ans = 0
//    var hang = 0
//    var lie = 0
//    fun numIslands(grid: Array<CharArray>): Int {
//        hang = grid.size
//        lie = grid[0].size
//        for (i in 0 until hang) {
//            for (k in 0 until lie) {
//                if (grid[i][k] == '1') {
//                    ans++
//                    dfs(grid, i, k)
//                }
//            }
//        }
//        return ans
//    }
//
//    fun dfs(grid: Array<CharArray>, i: Int, k: Int) {
//        grid[i][k] = '0'
//        if (i - 1 >= 0 && grid[i - 1][k] == '1') {
//            dfs(grid, i - 1, k)
//        }
//        if (k - 1 >= 0 && grid[i][k - 1] == '1') {
//            dfs(grid, i, k - 1)
//        }
//        if (i + 1 < hang && grid[i + 1][k] == '1') {
//            dfs(grid, i + 1, k)
//        }
//        if (k + 1 < lie && grid[i][k + 1] == '1') {
//            dfs(grid, i, k + 1)
//        }
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    var array1 = charArrayOf('1', '1', '1')
//    var array2 = charArrayOf('0', '1', '0')
//    var array3 = charArrayOf('1', '1', '1')
////    var array4 = charArrayOf('0', '0', '0', '1', '1')
//    var grid = arrayOf(array1, array2, array3)
//    solution.numIslands(grid)
//}