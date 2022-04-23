package 字节

import java.util.*
import kotlin.collections.ArrayList

class _全排列 {
}

//class Solution {
//    fun permute(nums: IntArray): List<List<Int>> {
//        val ans = ArrayList<ArrayList<Int>>()
//        val outPut = ArrayList<Int>()
//        for (i in nums) {
//            outPut.add(i)
//        }
//        addNums(nums.size, outPut, ans, 0)
//        return ans
//
//    }
//
//    fun addNums(size: Int, output: ArrayList<Int>, list: ArrayList<ArrayList<Int>>, cur: Int) {
//        if (cur == size) {
//            list.add(ArrayList<Int>(output))
//        }
//        for (i in cur until size) {
//            Collections.swap(output, cur, i)
//            addNums(size, output, list, cur + 1)
//            Collections.swap(output, cur, i)
//        }
//    }
//}

//class Solution {
//
//    val res = LinkedList<LinkedList<Int>>()
//
//    fun permute(nums: IntArray): List<List<Int>> {
//        val track = LinkedList<Int>()
//        backtrack(nums,track)
//        return res
//    }
//
//    fun backtrack(nums: IntArray,track:LinkedList<Int>){
//        if (track.size == nums.size){
//            res.add(LinkedList(track))
//        }
//        for (i in nums.indices){
//            if (track.contains(nums[i])) continue
//            track.add(nums[i])
//            backtrack(nums,track)
//            track.removeLast()
//        }
//    }
//}

//fun main() {
//    var solution = Solution()
//    solution.permute(intArrayOf(1,2,3))
//}