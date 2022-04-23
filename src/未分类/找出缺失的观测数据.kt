package 未分类

class 找出缺失的观测数据 {
}

//class Solution {
//    fun missingRolls(rolls: IntArray, mean: Int, n: Int): IntArray {
//        val m = rolls.size
//        val total = (m + m) * mean
//        var less = total
//        for (i in rolls) {
//            less -= i
//        }
//        if (less > 6 * n) return intArrayOf()
//        while (less!=0){
//
//        }
//    }
//}
//
//internal class Solution {
//    fun missingRolls(rolls: IntArray, mean: Int, n: Int): IntArray {
//        val m = rolls.size
//        val sum = mean * (n + m)
//        var missingSum = sum
//        for (roll in rolls) {
//            missingSum -= roll
//        }
//        if (missingSum < n || missingSum > 6 * n) {
//            return IntArray(0)
//        }
//        val quotient = missingSum / n
//        val remainder = missingSum % n
//        val missing = IntArray(n)
//        for (i in 0 until n) {
//            missing[i] = quotient + if (i < remainder) 1 else 0
//        }
//        return missing
//    }
//}