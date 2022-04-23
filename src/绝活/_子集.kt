package 绝活

import java.util.*
import kotlin.collections.ArrayList

class _子集 {
}

////回溯
//class Solution {
//
//    var ans = LinkedList<LinkedList<Int>>()
//
//    fun subsets(nums: IntArray): List<List<Int>> {
//        var track = LinkedList<Int>()
//        backtrack(nums, track, 0)
//        return ans
//    }
//
//    fun backtrack(nums: IntArray, track: LinkedList<Int>, index: Int) {
//        ans.add(LinkedList(track))
//        for (i in index until nums.size) {
//            track.add(nums[i])
//            backtrack(nums, track, i + 1)
//            track.removeLast()
//        }
//    }
//}
//
////dp
//class Solution {
//    fun subsets(nums: IntArray): List<List<Int>> {
//        var dp = ArrayList<ArrayList<Int>>()
//        val emptyArray = ArrayList<Int>()
//        dp.add(emptyArray)
//        for (i in nums) {
//            val newDp = ArrayList<ArrayList<Int>>(dp)
//            for (j in dp) {
//                val newOneArray = ArrayList(j)
//                newOneArray.add(i)
//                newDp.add(newOneArray)
//            }
//            dp = newDp
//        }
//        return dp
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.subsets(intArrayOf(1, 2, 3))
//}