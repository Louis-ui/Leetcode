package 练习

import java.util.LinkedList

class _交替 {
}

//class Solution {
//    fun shuffle(nums: IntArray, n: Int): IntArray {
//        var a = LinkedList<Int>()
//        var nums1 = IntArray(n)
//        var nums2 = IntArray(n)
//        for(i in 0 until n){
//            nums1[i] = nums[i]
//        }
//        for(j in n until 2*n){
//            nums2[j/2] = nums[j/2]
//        }
//        var m = 0
//        var n = 0
//        var ary = ArrayList<Int>()
//        while(m < n){
//            ary.add(nums1[m])
//            ary.add(nums2[n])
//            m++
//            n++
//        }
//        var ans = IntArray(nums.size)
//        for(k in ary.indices){
//            ans[k] = ary[k]
//        }
//        return ans
//    }
//}
//
//fun main() {
//    print(1/2)
//}