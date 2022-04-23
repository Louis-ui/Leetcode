package 剑指offer

class _11_旋转数组的最小数字 {
}

//class Solution {
//    fun minArray(numbers: IntArray): Int {
//        var i = 0
//        var j = numbers.size-1
//        while (i<j){
//            val m = i+(j-1)/2
//            if (numbers[m]>numbers[j]) i = m+1 else j = m
//        }
//        return numbers[j]
//    }
//}

//class Solution {
//    fun minArray(numbers: IntArray): Int {
//        var i = 0
//        var j = i+1
//        while (j<=numbers.size-1){
//            if (numbers[i]>numbers[j]) return numbers[j]
//            i++
//            j++
//        }
//        return numbers[0]
//    }
//}