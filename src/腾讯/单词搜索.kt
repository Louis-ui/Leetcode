package 腾讯

class 单词搜索 {
}

//class Solution {
//    fun exist(board: Array<CharArray>, word: String): Boolean {
//        val h = board.size
//        val w = board[0].size
//        val visited = Array(h) { BooleanArray(w) { false } }
//        for (i in 0 until h) {
//            for (j in 0 until w) {
//                val flag = check(board, visited, i, j, word, 0)
//                if (flag) {
//                    return true
//                }
//            }
//        }
//        return false
//    }
//
//    private fun check(
//        board: Array<CharArray>,
//        visited: Array<BooleanArray>,
//        i: Int,
//        j: Int,
//        s: String,
//        k: Int
//    ): Boolean {
//        if (board[i][j] != s[k]) {
//            return false
//        } else if (k == s.length - 1) {
//            return true
//        }
//        visited[i][j] = true
//        val directions = arrayOf(intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0))
//        var result = false
//        for (dir in directions) {
//            val newi = i + dir[0]
//            val newj = j + dir[1]
//            if (newi >= 0 && (newi < board.size) && (newj >= 0) && (newj < board[0].size)) {
//                if (!visited[newi][newj]) {
//                    val flag = check(board, visited, newi, newj, s, k + 1)
//                    if (flag) {
//                        result = true
//                        break
//                    }
//                }
//            }
//        }
//        visited[i][j] = false
//        return result
//    }
//}