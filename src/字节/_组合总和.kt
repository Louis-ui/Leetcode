package 字节

import java.util.*


class _组合总和 {
}

//internal class Solution {
//    val ans: MutableList<List<Int>> = ArrayList()
//    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
//        val combine: MutableList<Int> = ArrayList()
//        dfs(candidates, target, combine, 0)
//        return ans
//    }
//
//    fun dfs(candidates: IntArray, target: Int, combine: MutableList<Int>, idx: Int) {
//        if (idx == candidates.size) {
//            return
//        }
//        if (target == 0) {
//            ans.add(ArrayList(combine))
//            return
//        }
//        // 直接跳过
//        dfs(candidates, target, combine, idx + 1)
//        // 选择当前数
//        if (target - candidates[idx] >= 0) {
//            combine.add(candidates[idx])
//            dfs(candidates, target - candidates[idx], combine, idx)
//            combine.removeAt(combine.size - 1)
//        }
//    }
//}

//class Solution {
//    val ans = LinkedList<LinkedList<Int>>()
//    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
//        val track = LinkedList<Int>()
//        backtrack(candidates, track, target,0)
//        return ans
//    }
//
//    fun backtrack(nums: IntArray, track: LinkedList<Int>, target: Int,index: Int) {
//        if (target == 0) {
//            val newTrack = LinkedList<Int>(track)
//            ans.add(newTrack)
//        }
//        for (i in index until nums.size) {
//            if (nums[i] > target) continue
//            track.add(nums[i])
//            backtrack(nums, track, target - nums[i],i)
//            track.removeLast()
//        }
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.combinationSum(intArrayOf(2, 3, 6, 7), 7)
//}
