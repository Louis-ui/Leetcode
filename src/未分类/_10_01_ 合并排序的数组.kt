package 未分类

class `_10_01_ 合并排序的数组` {
}

//class Solution {
//    fun merge(A: IntArray, m: Int, B: IntArray, n: Int): Unit {
//        var j = 0
//        val C = IntArray(m + n)
//        for (k in A.indices) {
//            C[k] = A[k]
//        }
//        for (i in m..C.size - 1) {
//            C[i] = B[j]
//            j++
//        }
//        for (i in C.indices){
//            A[i]=sort(C)[i]
//        }
//    }
//
//    fun sort(arr: IntArray): IntArray{
//        var select = 0
//
//        val arrLen = arr.size
//
//        for (i in 1 until arrLen) {
//
//            select = arr[i]
//
//            var j = 0
//            j = i
//            while (j > 0 && select <= arr[j - 1]) {
//                arr[j] = arr[j - 1]
//                j--
//            }
//            //将选择值赋给比选择值小的后一位
//            arr[j] = select
//            for (item in arr) {
//                print(item)
//            }
//        }
//        return arr
//    }
//}

//fun main() {
//    var solution = Solution()
//    solution.merge(intArrayOf(4, 5, 6, 0, 0, 0), 3, intArrayOf(1, 2, 3), 3)
//}

//    fun sort(array: IntArray): IntArray {
//        for (k in 1 until array.size) {
//            var j = k - 1
//            val m = array[k]
//            while (array[j] > array[k]) {
//                if (j < 0) {
//                    continue
//                }
//                array[j + 1] = array[j]
//                array[j] = m
//                j--
//                k--
//            }
//        }
//        return array
//    }
