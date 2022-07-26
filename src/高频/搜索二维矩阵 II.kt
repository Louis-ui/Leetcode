package 高频

class `搜索二维矩阵 II` {
}

//class Solution {
//    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
//        if (matrix.isEmpty()) return false
//        for (i in matrix.indices) {
//            val array = matrix[i]
//            var left = 0
//            var right = array.size - 1
//            while (left <= right) {
//                val mid = left + (right - left) / 2
//                if (array[mid] == target) {
//                    return true
//                } else if (array[mid] < target) {
//                    left = mid+1
//                } else if (array[mid] > target) {
//                    right = mid -1
//                }
//            }
//        }
//        return false
//    }
//}