package 娱乐

import java.util.*

class _打乱数组 {
}

//class Solution(nums: IntArray) {
//
//    val res = LinkedList<LinkedList<Int>>()
//    val origin = nums
//
//    init {
//        permute(nums)
//    }
//
//    fun reset(): IntArray {
//        return origin
//    }
//
//    fun shuffle(): IntArray {
//        val ans = IntArray(origin.size)
//        for (i in res[Random().nextInt(res.size)].indices){
//            ans[i] = res[Random().nextInt(res.size)][i]
//        }
//        return ans
//    }
//
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
//
//}

//internal class Solution(var nums: IntArray) {
//    var original: IntArray
//    fun reset(): IntArray {
//        System.arraycopy(original, 0, nums, 0, nums.size)
//        return nums
//    }
//
//    fun shuffle(): IntArray {
//        val random = Random()
//        for (i in nums.indices) {
//            val j = i + random.nextInt(nums.size - i)
//            val temp = nums[i]
//            nums[i] = nums[j]
//            nums[j] = temp
//        }
//        return nums
//    }
//
//    init {
//        original = IntArray(nums.size)
//        System.arraycopy(nums, 0, original, 0, nums.size)
//    }
//}

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(nums)
 * var param_1 = obj.reset()
 * var param_2 = obj.shuffle()
 */
