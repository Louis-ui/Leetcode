package 字节

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

class `_全排列 Ⅱ` {
}

//class Solution {
//    fun permuteUnique(nums: IntArray): List<List<Int>> {
//        var ans = ArrayList<ArrayList<Int>>()
//        val outPut = ArrayList<Int>()
//        for (i in nums) {
//            outPut.add(i)
//        }
//        var hashSet = HashSet<ArrayList<Int>>()
//        addNums(nums.size, outPut, hashSet, 0)
//        for (i in hashSet) ans.add(i)
//        return ans
//
//    }
//
//    fun addNums(size: Int, output: ArrayList<Int>, list: HashSet<ArrayList<Int>>, cur: Int) {
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