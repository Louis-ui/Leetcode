package 牛客

import java.math.BigInteger

class 填充数组 {
}
//
//object Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     *
//     * @param a int整型一维数组
//     * @param k int整型
//     * @return int整型
//     */
//    fun FillArray(a: IntArray, k: Int): Int {
//        // write code here
//        return findSolution(a, k).mod(BigInteger.valueOf(1000000007)).toInt()
//    }
//
//    private fun findSolution(a: IntArray, k: Int): BigInteger {
//        val b = IntArray(a.size + 2)
//        b[0] = 1
//        b[b.size - 1] = k
//        System.arraycopy(a, 0, b, 1, a.size)
//        var res = BigInteger.ONE
//        var begin = 1
//        val lastIndex = b.size - 1
//        while (begin < lastIndex) {
//            while (0 != b[begin]) {
//                if (lastIndex == begin) return res
//                begin++
//            }
//            val min = b[begin - 1]
//            var zero = 0
//            while (0 == b[begin]) {
//                zero++
//                begin++
//            }
//            val max = b[begin]
//            val sols = max - min + 1
//            res = res.multiply(fillZero(sols, zero))
//        }
//        return res
//    }
//
//    private fun fillZero(sols: Int, zero: Int): BigInteger? {
//        var zero = zero
//        return if (zero > 1) {
//            val prob = arrayOfNulls<BigInteger>(sols)
//            for (i in 0 until sols) {
//                prob[i] = BigInteger.valueOf((i + 1).toLong())
//            }
//            while (zero-- > 1) {
//                val temp = arrayOfNulls<BigInteger>(sols)
//                for (j in 1 until sols) {
//                    prob[j] = prob[j - 1]!!.add(prob[j])
//                }
//            }
//            prob[sols - 1]
//        } else {
//            BigInteger.valueOf(sols.toLong())
//        }
//    }
//}