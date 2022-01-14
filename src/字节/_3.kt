package 字节

import java.util.*

class _3 {
}

//class Solution {
//    fun optimalDivision(nums: IntArray): String {
//        Arrays.sort(nums)
//        var stringBuffer = StringBuffer()
//        stringBuffer.append(nums[nums.size-1])
//        stringBuffer.append('/')
//        stringBuffer.append("(")
//        for (i in nums.size-2 downTo 1){
//            stringBuffer.append(nums[i].toString())
//            stringBuffer.append('/')
//        }
//        stringBuffer.append(nums[0].toString())
//        stringBuffer.append(")")
//        return stringBuffer.toString()
//    }
//}