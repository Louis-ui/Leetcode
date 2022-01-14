package 未分类


class _326_3的幂 {
}

//class Solution {
//    fun isPowerOfThree(n: Int): Boolean {
//        var i = n
//        while (i != 0 && i % 3 == 0) {
//            i /= 3
//        }
//        return i == 1
//    }
//}

//class Solution {
//    fun isPowerOfThree(n: Int): Boolean {
//        val set: HashSet<Int?> = object : HashSet<Int?>() {
//            init {
//                add(1)
//                add(3)
//                add(9)
//                add(27)
//                add(81)
//                add(243)
//                add(729)
//                add(2187)
//                add(6561)
//                add(19683)
//                add(59049)
//                add(177147)
//                add(531441)
//                add(1594323)
//                add(4782969)
//                add(14348907)
//                add(43046721)
//                add(129140163)
//                add(387420489)
//                add(1162261467)
//            }
//        }
//        return set.contains(n)
//    }
//}

//fun main() {
//    var solution = Solution()
//    solution.isPowerOfThree(1)
//}