package 字节

class 最大正方形 {
}

//class Solution {
//    fun maximalSquare(matrix: Array<CharArray>): Int {
//        var limit: Int = 0
//        val maxHang = matrix.size - 1
//        var maxLie = matrix[0].size - 1
//        for (i in matrix.indices) {
//            for (j in matrix[i].indices) {
//                if (matrix[i][j] == '1') {
//                    limit = Math.min(
//                        maxHang - i, maxLie - j
//                    )
//                    if (matrix[i + 1][j + 1] != '1' || i + 1 <= limit || j + 1 <= limit) {
//                        continue
//                    } else if (matrix[i][j + 1] != '1' || i + 1 <= limit || j + 1 <= limit) {
//
//
//                    } else if (matrix[i + 1][j] != '1' || i + 1 <= limit || j + 1 <= limit) {
//
//                    }
//                }
//            }
//        }
//        return limit * limit
//
//    }
//}

