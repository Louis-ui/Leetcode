package 腾讯

class 合并区间 {

}

//class Solution {
//    fun minIncrementForUnique(nums: IntArray): Int {
//        val count = IntArray(80000)
//        for (x in nums) {
//            count[x]++
//        }
//        var ans = 0
//        var taken = 0
//        for (x in 0..79999) {
//            if (count[x] >= 2) {
//                taken += count[x] - 1
//                ans -= x * (count[x] - 1)
//            } else if (taken > 0 && count[x] == 0) {
//                taken--
//                ans += x
//            }
//        }
//        return ans
//    }
//}
