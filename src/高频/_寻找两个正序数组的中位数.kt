package 高频

class _寻找两个正序数组的中位数 {
}
//
//class Solution {
//    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
//        val nums3 = IntArray(nums1.size + nums2.size)
//        var temp1 = 0
//        var temp2 = 0
//        var temp3 = 0
//        while (temp3 != nums3.size) {
//            if (temp1 == nums1.size) {
//                while (temp2 != nums2.size) {
//                    nums3[temp3] = nums2[temp2]
//                    temp2++
//                    temp3++
//                }
//                break
//            }
//            if (temp2 == nums2.size) {
//                while (temp1 != nums1.size) {
//                    nums3[temp3] = nums1[temp1]
//                    temp1++
//                    temp3++
//                }
//                break
//            }
//            if (nums1[temp1] > nums2[temp2]) {
//                nums3[temp3] = nums2[temp2]
//                temp2++
//                temp3++
//            } else if (nums1[temp1] <= nums2[temp2]) {
//                nums3[temp3] = nums1[temp1]
//                temp1++
//                temp3++
//            }
//
//        }
//        if (nums3.size and 1 == 0) {
//            return (nums3[(nums3.size) / 2] + nums3[(nums3.size) / 2 - 1]) / 2.toDouble()
//        } else {
//            return nums3[(nums3.size - 1) / 2].toDouble()
//        }
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    var nums1 = intArrayOf(1, 2)
//    var nums2 = intArrayOf(3, 4)
//    print(solution.findMedianSortedArrays(nums1, nums2))
//}