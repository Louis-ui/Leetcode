package 剑指offer


class _39_数组中出现次数超过一半的数字 {
}

//internal class Solution {
//    private fun countNums(nums: IntArray): Map<Int, Int> {
//        val counts: MutableMap<Int, Int> = HashMap()
//        for (num in nums) {
//            if (!counts.containsKey(num)) {
//                counts[num] = 1
//            } else {
//                counts[num] = counts[num]!! + 1
//            }
//        }
//        return counts
//    }
//
//    fun majorityElement(nums: IntArray): Int {
//        val counts = countNums(nums)
//        var majorityEntry: Map.Entry<Int, Int>? = null
//        for (entry in counts.entries) {
//            if (majorityEntry == null || entry.value > majorityEntry.value) {
//                majorityEntry = entry
//            }
//        }
//        return majorityEntry!!.key
//    }
//}