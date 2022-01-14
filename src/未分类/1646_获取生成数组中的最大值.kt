package 未分类

class `1646_获取生成数组中的最大值` {
}

//class Solution {
//    fun getMaximumGenerated(n: Int): Int {
//        val array = IntArray(n+1)
//        array[0] = 0
//        if (array.size!=1){
//            array[1] = 1
//        }
//        for (i in 1..n){
//            if ( (2*i) in 2..n){
//                array[2*i] = array[i]
//            }
//            if ( (2*i+1) in 2..n){
//                array[2*i+1] = array[i]+array[i+1]
//            }
//        }
//        for (k in 1 until array.size){
//            var j = k-1
//            val m = array[k]
//            while (array[j]>array[k]){
//                if (j<0){
//                    continue
//                }
//                array[j+1]= array[j]
//                array[j] = m
//                j--
//            }
//        }
//        return array[array.size-1]
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.getMaximumGenerated(4)
//}