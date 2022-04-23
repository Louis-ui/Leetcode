package 字节

class _盛最多水的容器 {
}

//class Solution {
//    fun maxArea(height: IntArray): Int {
//        var ans = Int.MIN_VALUE
//        for (i in height.indices){
//            for (j in i+1 until height.size){
//                ans = Math.max(ans,(j-i)*(Math.min(height[i],height[j])))
//            }
//        }
//        return ans
//    }
//}
//
//
//class Solution {
//    fun maxArea(height: IntArray): Int {
//        var ans = Int.MIN_VALUE
//        var left = 0
//        var right = height.size-1
//        while (left<right){
//            ans = Math.max(ans,Math.min(height[left],height[right])*(right-left))
//            if (height[right]<height[left]){
//                right--
//            }else{
//                left++
//            }
//        }
//        return ans
//    }
//}