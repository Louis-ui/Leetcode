<<<<<<< HEAD
package 剑指offer

class _29_顺时针打印矩阵 {
}

//class Solution {
//    fun spiralOrder(matrix: Array<IntArray>): IntArray {
//        var ans = mutableListOf<Int>()
//        var thang = matrix.size
//        var tlie = matrix[0].size
//        var hang = 0
//        var lie = 0
//        var hangorlie = true
//        var visited = Boolean[thang][tlie]
//        while (!matrix.isEmpty()){
//            ans.add(matrix.get(hang).get(lie))
//            if (hangorlie){
//                lie++
//            }else{
//                hang++
//            }
//
//        }
//    }
//}

//internal class Solution {
//    fun spiralOrder(matrix: Array<IntArray>?): IntArray {
//        if (matrix == null || matrix.size == 0 || matrix[0].isEmpty()) {
//            return IntArray(0)
//        }
//        val rows = matrix.size
//        val columns: Int = matrix[0].size
//        val visited = Array(rows) {
//            BooleanArray(
//                columns
//            )
//        }
//        val total = rows * columns
//        val order = IntArray(total)
//        var row = 0
//        var column = 0
//        val directions = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(-1, 0))
//        var directionIndex = 0
//        for (i in 0 until total) {
//            order[i] = matrix[row][column]
//            visited[row][column] = true
//            val nextRow = row + directions[directionIndex][0]
//            val nextColumn = column + directions[directionIndex][1]
//            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || visited[nextRow][nextColumn]) {
//                directionIndex = (directionIndex + 1) % 4
//            }
//            row += directions[directionIndex][0]
//            column += directions[directionIndex][1]
//        }
//        return order
//    }
=======
package 剑指offer

class _29_顺时针打印矩阵 {
}

//class Solution {
//    fun spiralOrder(matrix: Array<IntArray>): IntArray {
//        var ans = mutableListOf<Int>()
//        var thang = matrix.size
//        var tlie = matrix[0].size
//        var hang = 0
//        var lie = 0
//        var hangorlie = true
//        var visited = Boolean[thang][tlie]
//        while (!matrix.isEmpty()){
//            ans.add(matrix.get(hang).get(lie))
//            if (hangorlie){
//                lie++
//            }else{
//                hang++
//            }
//
//        }
//    }
//}

//internal class Solution {
//    fun spiralOrder(matrix: Array<IntArray>?): IntArray {
//        if (matrix == null || matrix.size == 0 || matrix[0].isEmpty()) {
//            return IntArray(0)
//        }
//        val rows = matrix.size
//        val columns: Int = matrix[0].size
//        val visited = Array(rows) {
//            BooleanArray(
//                columns
//            )
//        }
//        val total = rows * columns
//        val order = IntArray(total)
//        var row = 0
//        var column = 0
//        val directions = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(-1, 0))
//        var directionIndex = 0
//        for (i in 0 until total) {
//            order[i] = matrix[row][column]
//            visited[row][column] = true
//            val nextRow = row + directions[directionIndex][0]
//            val nextColumn = column + directions[directionIndex][1]
//            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || visited[nextRow][nextColumn]) {
//                directionIndex = (directionIndex + 1) % 4
//            }
//            row += directions[directionIndex][0]
//            column += directions[directionIndex][1]
//        }
//        return order
//    }
//}

//class Solution {
//    fun spiralOrder(matrix: Array<IntArray>): IntArray {
//        if (matrix.isEmpty()) return IntArray(0)
//        var left = 0
//        var right = matrix[0].size - 1
//        var top = 0
//        var bottom = matrix.size - 1
//        var x = 0
//        val res = IntArray((right + 1) * (bottom + 1))
//        while (true) {
//            for (i in left..right) res[x++] = matrix[top][i]
//            if (++top > bottom) break
//            for (i in top..bottom) res[x++] = matrix[i][right]
//            if (left > --right) break
//            for (i in right downTo left) res[x++] = matrix[bottom][i]
//            if (top > --bottom) break
//            for (i in bottom downTo top) res[x++] = matrix[i][left]
//            if (++left > right) break
//        }
//        return res
//    }
//}
//
//object Solution {
//    fun spiralOrder(matrix: Array<IntArray>): IntArray {
//        if (matrix.isEmpty()) return IntArray(0)
//        var left = 0
//        var right = matrix[0].size - 1
//        var top = 0
//        var bottom = matrix.size - 1
//        var x = 0
//        val res = IntArray((right + 1) * (bottom + 1))
//        while (true) {
//            for (i in left .. right) res[x++] = matrix[top][i]
//            if (++top > bottom) break
//            for (i in top .. bottom) res[x++] = matrix[i][right]
//            if (--right<left) break
//            for (i in right downTo left) res[x++] = matrix[bottom][i]
//            if (--bottom < top) break
//            for (i in bottom downTo top) res[x++] = matrix[i][left]
//            if (++left > right) break
//
//        }
//        return res
//    }
//
//}
//
//fun main() {
//    var solution = Solution()
//    solution.spiralOrder(arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9)))
>>>>>>> origin/master
//}