package 高频


class _两数之和 {
}


//class Solution {
//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        val hashtable: MutableMap<Int,Int> = HashMap()
//        for (i in nums.indices) {
//            for (k in i + 1 until nums.size) {
//                if (hashtable.containsKey(target - nums[i])){
//                    return intArrayOf(hashtable[target - nums[i]]!!,i)
//                }
//                hashtable[nums[i]] = i
//            }
//        }
//        return intArrayOf()
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.twoSum(intArrayOf(2, 7, 11, 15), 9)
//}

//class Solution {
//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        val hashtable: MutableMap<Int, Int> = HashMap()
//        for (i in nums.indices) {
//            if (hashtable.containsKey(target - nums[i])) {
//                return intArrayOf(hashtable[target - nums[i]]!!, i)
//            }
//            hashtable[nums[i]] = i
//        }
//        return IntArray(0)
//    }
//}