package 高频

class _一次编辑 {
}

//class Solution {
//    fun oneEditAway(first: String, second: String): Boolean {
//        if (first.length - second.length > 1) return false
//        if (first == second) return true
//        var temp1 = 0
//        var temp2 = 0
//        var count = 0
//        while (temp1 < first.length && temp2 < second.length) {
//            if (first[temp1] != second[temp2]) count++
//            temp1++
//            temp2++
//        }
//        while (temp1 < first.length) temp1++
//        while (temp2 < second.length) temp2++
//        return count <= 1
//    }
//}
//
//
//internal class Solution {
//    fun oneEditAway(first: String, second: String): Boolean {
//        val m = first.length
//        val n = second.length
//        return if (n - m == 1) {
//            oneInsert(first, second)
//        } else if (m - n == 1) {
//            oneInsert(second, first)
//        } else if (m == n) {
//            var foundDifference = false
//            for (i in 0 until m) {
//                if (first[i] != second[i]) {
//                    foundDifference = if (!foundDifference) {
//                        true
//                    } else {
//                        return false
//                    }
//                }
//            }
//            true
//        } else {
//            false
//        }
//    }
//
//    fun oneInsert(shorter: String, longer: String): Boolean {
//        val length1 = shorter.length
//        val length2 = longer.length
//        var index1 = 0
//        var index2 = 0
//        while (index1 < length1 && index2 < length2) {
//            if (shorter[index1] == longer[index2]) {
//                index1++
//            }
//            index2++
//            if (index2 - index1 > 1) {
//                return false
//            }
//        }
//        return true
//    }
//}