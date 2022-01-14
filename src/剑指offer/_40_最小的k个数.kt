package 剑指offer

class _40_最小的k个数 {
}

//class Solution {
//    fun getLeastNumbers(arr: IntArray, k: Int): IntArray {
//        sort(arr)
//
////        var j: Int
////        var gap = arr.size / 2
////        while (gap > 0) {
////            for (i in gap until arr.size) {
////                val tmp = arr[i]
////                j = i
////                while (j >= gap && tmp < arr[j - gap]) {
////                    arr[j] = arr[j - gap]
////                    j -= gap
////                }
////                arr[j] = tmp
////            }
////            gap /= 2
////        }
//
////        var end = arr.size-1
////        while (end >0){
////            var i = 0
////            var j = 1
////            var mid = 0
////            while (j<=end){
////                if (arr[i]>arr[j]){
////                    mid = arr[i]
////                    arr[i] = arr[j]
////                    arr[j] = mid
////                }
////                i++
////                j++
////            }
////            end--
////        }
//
////        val size = arr.size
////        for (m in 1 until size) {
////            var curCompare = m - 1
////            var cur = m
////            while (curCompare >= 0 && arr[cur] < arr[curCompare]) {
////                val mid = arr[cur]
////                arr[cur] = arr[curCompare]
////                arr[curCompare] = mid
////                curCompare--
////                cur--
////            }
////        }
//
////        Arrays.sort(arr)
//
////        var start = 0
////        var size = arr.size
////        var x = 0
////        while (start!=size-1) {
////            var min = Int.MAX_VALUE
////            for (i in start until size) {
////                if (arr[i] < min) {
////                    min = arr[i]
////                    x = i
////                }
////            }
////            arr[x] = arr[start]
////            arr[start] = min
////            start++
////        }
//
//        val ans = IntArray(k)
//        for (n in 0 until k) {
//            ans[n] = arr[n]
//        }
//        return ans
//    }
//
////    fun cutIt(array: IntArray,left:Int,right:Int){
////        val mid = left + (right-right)/2
////
////        if (array.size!=1){
////
////        }
////    }
////
////    fun sort(a: IntArray, b: IntArray) : IntArray{
////        var i = 0
////        var j = 0
////        var k = 0
////        val ans = IntArray(a.size + b.size)
////        while (j != a.size - 1 || j != b.size - 1) {
////            if (a[i] < b[j]) {
////                ans[k] = a[i]
////                i++
////            }else{
////                ans[k] = b[j]
////                j++
////            }
////            k++
////        }
////        return ans
////    }
//
//    fun sort(arr: IntArray) {
//        val temp = IntArray(arr.size) //在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
//        sort(arr, 0, arr.size - 1, temp)
//    }
//
//    private fun sort(arr: IntArray, left: Int, right: Int, temp: IntArray) {
//        if (left < right) {
//            val mid = (left + right) / 2
//            sort(arr, left, mid, temp) //左边归并排序，使得左子序列有序
//            sort(arr, mid + 1, right, temp) //右边归并排序，使得右子序列有序
//            merge(arr, left, mid, right, temp) //将两个有序子数组合并操作
//        }
//    }
//
//    private fun merge(arr: IntArray, left: Int, mid: Int, right: Int, temp: IntArray) {
//        var left = left
//        var i = left //左序列指针
//        var j = mid + 1 //右序列指针
//        var t = 0 //临时数组指针
//        while (i <= mid && j <= right) {
//            if (arr[i] <= arr[j]) {
//                temp[t++] = arr[i++]
//            } else {
//                temp[t++] = arr[j++]
//            }
//        }
//        while (i <= mid) { //将左边剩余元素填充进temp中
//            temp[t++] = arr[i++]
//        }
//        while (j <= right) { //将右序列剩余元素填充进temp中
//            temp[t++] = arr[j++]
//        }
//        t = 0
//        //将temp中的元素全部拷贝到原数组中
//        while (left <= right) {
//            arr[left++] = temp[t++]
//        }
//    }
//
//}


//
//fun main() {
//    val test = Solution()
//    test.getLeastNumbers(intArrayOf(0, 1, 1, 2, 4, 4, 1, 3, 3, 2), 6)
//}