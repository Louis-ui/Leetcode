package 字节


class _快乐数 {
}

//class Solution {
//    fun isHappy(n: Int): Boolean {
//        var set = hashSetOf<Int>()
//        var a = n
//        while (a != 1) {
//            var total = 0
//            for (i in a.toString()) {
//                val b = (i.code)-48
//                total += Math.pow(b.toDouble(),2.0).toInt()
//            }
//            if (set.contains(total)) return false else set.add(total)
//            a = total
//        }
//        return true
//    }
//}
//
//internal class Solution {
//    private fun getNext(n: Int): Int {
//        var n = n
//        var totalSum = 0
//        while (n > 0) {
//            val d = n % 10
//            n = n / 10
//            totalSum += d * d
//        }
//        return totalSum
//    }
//
//    fun isHappy(n: Int): Boolean {
//        var n = n
//        val seen: MutableSet<Int> = HashSet()
//        while (n != 1 && !seen.contains(n)) {
//            seen.add(n)
//            n = getNext(n)
//        }
//        return n == 1
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.isHappy(19)
//}