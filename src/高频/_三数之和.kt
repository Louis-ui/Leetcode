package 高频

import java.util.*
import kotlin.collections.ArrayList

class _三数之和 {
}

//class Solution {
//    fun threeSum(nums: IntArray): List<List<Int>> {
//        val ans: ArrayList<List<Int>> = ArrayList()
//        Arrays.sort(nums)
//        for (i in nums.indices) {
//            if (i == 0 || nums[i] != nums[i - 1]) {
//                for (j in i + 1 until nums.size) {
//                    if (j == i + 1 || nums[j] != nums[j - 1]) {
//                        var k = nums.size - 1
//                        while (j<k && nums[i] + nums[j] + nums[k] > 0){
//                            k--
//                        }
//                        if (k == j) break
//                        if (nums[i] + nums[j] + nums[k] == 0) {
//                            val one = arrayListOf<Int>(nums[i], nums[j], nums[k])
//                            ans.add(one)
//                        }
//
//                    }
//                }
//            }
//
//        }
//        return ans
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.threeSum(intArrayOf(-1,0,1,2,-2,-4))
//}