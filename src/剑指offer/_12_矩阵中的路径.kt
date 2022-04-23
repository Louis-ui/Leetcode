package 剑指offer

class _12_矩阵中的路径 {
}

//class Solution {
//    fun exist(board: Array<CharArray>, word: String): Boolean {
//        val words = word.toCharArray()
//        for (i in board.indices) {
//            for (j in board[0].indices) {
//                if (dfs(board, words, i, j, 0)) return true
//            }
//        }
//        return false
//    }
//
//    fun dfs(board: Array<CharArray>, word: CharArray, i: Int, j: Int, k: Int): Boolean {
//        if (i >= board.size || i < 0 || j >= board[0].size || j < 0 || board[i][j] != word[k]) return false
//        if (k == word.size - 1) return true
//        val tmp = board[i][j]
//        board[i][j] = '/'
//        val result = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
//                dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1)
//        board[i][j] = tmp
//        return result
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    println(
//        solution.exist(
//            arrayOf(
//                charArrayOf('a', 'b', 'c', 'e'),
//                charArrayOf('s', 'f', 'c', 's'),
//                charArrayOf('a', 'd', 'e', 'e')
//            ), "abcced"
//        )
//    )
//}