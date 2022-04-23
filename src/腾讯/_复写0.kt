package 腾讯

class _复写0 {
}


//class Solution {
//    fun duplicateZeros(arr: IntArray): Unit {
//        var temp1 = 0
//        while (temp1 < arr.size - 1) {
//            if (arr[temp1] == 0){
//                var temp2 = temp1+1
//                var mid = arr[temp2]
//                arr[temp2] = 0
//                while (temp2 != arr.size-1){
//                    val last = arr[temp2+1]
//                    arr[temp2+1] = mid
//                    mid = last
//                    temp2++
//                }
//                temp1++
//            }
//            temp1++
//        }
//    }
//}


//fun main() {
//    var solution = Solution()
//    solution.duplicateZeros(intArrayOf(1,5,2,0,6,8,0,6,0))
//}