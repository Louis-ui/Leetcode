package 高频


class `_和为 K 的子数组` {
}

//class Solution {
//    fun subarraySum(nums: IntArray, k: Int): Int {
////        var hashtable : MutableMap<Int,Int> = HashMap()
//
//        val sum = IntArray(nums.size + 1)
//        for (i in nums.indices) {
//            sum[i + 1] = sum[i] + nums[i]
//        }
//        for (i in nums.indices){
//            for ()
//        }
//    }
//}
//
//class Solution {
//    fun subarraySum(nums: IntArray, k: Int): Int {
//        var count = 0
//        for (start in nums.indices) {
//            var sum = 0
//            for (end in start downTo 0) {
//                sum += nums[end]
//                if (sum == k) {
//                    count++
//                }
//            }
//        }
//        return count
//    }
//}
//
//class Solution {
//    fun subarraySum(nums: IntArray, k: Int): Int {
//        var count = 0
//        var pre = 0
//        val mp = HashMap<Int, Int>()
//        mp[0] = 1
//        for (i in nums.indices) {
//            pre += nums[i]
//            if (mp.containsKey(pre - k)) {
//                count += mp[pre - k]!!
//            }
//            mp[pre] = mp.getOrDefault(pre, 0) + 1
//        }
//        return count
//    }
//}