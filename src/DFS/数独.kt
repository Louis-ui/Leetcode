package DFS


class 数独 {
}

//class Solution {
//    fun solveSudoku(board: Array<CharArray>): Unit {
//
//    }
//}
//
//internal class Solution {
//    private val line = Array(9) { BooleanArray(9) }
//    private val column = Array(9) { BooleanArray(9) }
//    private val block = Array(3) {
//        Array(3) {
//            BooleanArray(9)
//        }
//    }
//    private var valid = false
//    private val spaces: MutableList<IntArray> = ArrayList()
//    fun solveSudoku(board: Array<CharArray>) {
//        for (i in 0..8) {
//            for (j in 0..8) {
//                if (board[i][j] == '.') {
//                    spaces.add(intArrayOf(i, j))
//                } else {
//                    val digit = board[i][j].code - '0'.code - 1
//                    block[i / 3][j / 3][digit] = true
//                    column[j][digit] = block[i / 3][j / 3][digit]
//                    line[i][digit] = column[j][digit]
//                }
//            }
//        }
//        dfs(board, 0)
//    }
//
//    fun dfs(board: Array<CharArray>, pos: Int) {
//        if (pos == spaces.size) {
//            valid = true
//            return
//        }
//        val space = spaces[pos]
//        val i = space[0]
//        val j = space[1]
//        var digit = 0
//        while (digit < 9 && !valid) {
//            if (!line[i][digit] && !column[j][digit] && !block[i / 3][j / 3][digit]) {
//                block[i / 3][j / 3][digit] = true
//                column[j][digit] = block[i / 3][j / 3][digit]
//                line[i][digit] = column[j][digit]
//                board[i][j] = (digit + '0'.code + 1).toChar()
//                dfs(board, pos + 1)
//                block[i / 3][j / 3][digit] = false
//                column[j][digit] = block[i / 3][j / 3][digit]
//                line[i][digit] = column[j][digit]
//            }
//            ++digit
//        }
//    }
//}