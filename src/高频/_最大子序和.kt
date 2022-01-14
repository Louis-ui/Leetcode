package 高频

class _最大子序和 {
}

//class Solution {
//    fun maxSubArray(nums: IntArray): Int {
//        var per = 0
//        var max = nums[0]
//        for (i in nums) {
//            per = Math.max(i, per + i)
//            max = Math.max(per, max)
//        }
//        return max
//    }
//}

//class Solution {
//    fun maxSubArray(nums: IntArray): Int {
//        return get(nums, 0, nums.size - 1)
//    }
//
//    fun get(a: IntArray, l: Int, r: Int): Int {
//        val m = l + (r - l) / 2
//        get(a, l, m)
//        get(a, m + 1, r)
//        if (r - l == 1) {
//            var isum = a[l] + a[r]
//            var lsum = a[l]
//            var rsum = a[r]
//
//        }
//    }
//
//}

//class Solution {
//    class Status(var lSum: Int, var rSum: Int, var mSum: Int, var iSum: Int)
//
//    fun maxSubArray(nums: IntArray): Int {
//        return getInfo(nums, 0, nums.size - 1).mSum
//    }
//
//    fun getInfo(a: IntArray, l: Int, r: Int): Solution.Status {
//        if (l == r) {
//            return Solution.Status(a[l], a[l], a[l], a[l])
//        }
//        val m = l + r shr 1
//        val lSub: Solution.Status = getInfo(a, l, m)
//        val rSub: Solution.Status = getInfo(a, m + 1, r)
//        return pushUp(lSub, rSub)
//    }
//
//    fun pushUp(l: Solution.Status, r: Solution.Status): Solution.Status {
//        val iSum: Int = l.iSum + r.iSum
//        val lSum: Int = Math.max(l.lSum, l.iSum + r.lSum)
//        val rSum: Int = Math.max(r.rSum, r.iSum + l.rSum)
//        val mSum: Int = Math.max(Math.max(l.mSum, r.mSum), l.rSum + r.lSum)
//        return Solution.Status(lSum, rSum, mSum, iSum)
//    }
//}