package 字节

class _4 {
}

//class Solution {
//    fun dietPlanPerformance(calories: IntArray, k: Int, lower: Int, upper: Int): Int {
//        var ans = 0
//
//        val size = calories.size
//        val sum = IntArray(size + 1)
//        for (i in calories.indices) {
//            sum[i + 1] = sum[i] + calories[i]
//        }
//        var checkArray = IntArray(calories.size)
//        for (i in checkArray.indices) {
//            if ((i+k-1)>calories.size-1) break
//            checkArray[i] = sum[i+k+1-1]-sum[i]
//        }
//        for (i in checkArray) {
//            i.let {
//                when (true) {
//                it < lower -> ans--
//                it > upper -> ans++
//                    else -> false
//                } }
//        }
//        return ans
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    print(solution.dietPlanPerformance(intArrayOf(1,2,3,4,5),2,3,3))
//}