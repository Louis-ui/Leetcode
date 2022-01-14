package 数据结构

class _217_存在重复元素 {
}

//class Solution {
//    fun containsDuplicate(nums: IntArray): Boolean {
//        val set = HashSet<Int>()
//        for (i in nums) {
//            if (set.add(i) == false) return true
//        }
//        return false
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.containsDuplicate(intArrayOf(1, 2, 3, 4))
//}

//class Solution {
//    fun containsDuplicate(nums: IntArray): Boolean {
//        for (i in nums.indices) {
//            for (j in i + 1 until nums.size) {
//                if (nums[i] == nums[j]) {
//                    return true
//                }
//            }
//        }
//        return false
//    }
//}