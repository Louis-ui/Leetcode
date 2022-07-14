package 高频

class `Z 字形变换` {
}

//class Solution {
//    fun convert(s: String, numRows: Int): String {
//        val length = s.length
//        if (numRows == 1) return s
//        val lie = (length / (2 * numRows - 2)) * (numRows - 1) + (length % (2 * numRows - 2))
//        val charArrays = Array<CharArray>(numRows) { CharArray(lie) { '0' } }
//        var temp1 = 0
//        var rowLimit = 0
//        var lieLimit = 0
//        while (temp1 < length) {
//            while (rowLimit <= numRows - 1 && temp1 < length) {
//                charArrays[rowLimit][lieLimit] = s[temp1]
//                temp1++
//                if (rowLimit < numRows - 1) rowLimit++ else break
//            }
//            rowLimit--
//            lieLimit++
//            while (rowLimit > 0 && lieLimit < lie - 1 && temp1 < length) {
//                charArrays[rowLimit][lieLimit] = s[temp1]
//                temp1++
//                if (rowLimit != 0) {
//                    rowLimit--
//                    lieLimit++
//                } else break
//            }
//        }
//        var ans = java.lang.StringBuilder()
//        for ( i in charArrays){
//            for (j in i){
//                if (j != '0')
//                ans.append(j)
//            }
//        }
//        return ans.toString()
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.convert("A",1)
//
//}