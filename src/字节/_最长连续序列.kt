package 字节


class _最长连续序列 {
}

//class Solution {
//    fun longestConsecutive(nums: IntArray): Int {
//        var ans = 1
//        if (nums.isEmpty()) return 0
//        val set = HashSet<Int>()
//        for (num in nums) set.add(num)
//        for (i in nums.indices){
//            var curAns = 1
//            var order = nums[i]+1
//            var cur = 0
//            while (cur<nums.size){
//                if (nums[cur] == order || set.contains(order)) {
//                    curAns++
//                    order++
//                }else{
//                    cur++
//                }
//            }
//            ans = Math.max(ans,curAns)
//        }
//        return ans
//    }
//}

//class Solution {
//    fun longestConsecutive(nums: IntArray): Int {
//        val num_set: MutableSet<Int> = HashSet()
//        for (num in nums) {
//            num_set.add(num)
//        }
//        var longestStreak = 0
//        for (num in num_set) {
//            if (!num_set.contains(num - 1)) {
//                var currentNum = num
//                var currentStreak = 1
//                while (num_set.contains(currentNum + 1)) {
//                    currentNum += 1
//                    currentStreak += 1
//                }
//                longestStreak = Math.max(longestStreak, currentStreak)
//            }
//        }
//        return longestStreak
//    }
//}

//fun main() {
//    var solution = Solution()
//    print(solution.longestConsecutive(intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14)))
//}