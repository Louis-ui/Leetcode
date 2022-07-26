package DFS


class 电话号码的字母组合 {
}
//
//class Solution {
//    fun letterCombinations(digits: String): List<String> {
//        val hashMap = HashMap<Char, CharArray>()
//        hashMap['2'] = charArrayOf('a', 'b', 'c')
//        hashMap['3'] = charArrayOf('d', 'e', 'f')
//        hashMap['4'] = charArrayOf('g', 'h', 'i')
//        hashMap['5'] = charArrayOf('j', 'k', 'l')
//        hashMap['6'] = charArrayOf('m', 'n', 'o')
//        hashMap['7'] = charArrayOf('p', 'q', 'r', 's')
//        hashMap['8'] = charArrayOf('t', 'u', 'v')
//        hashMap['9'] = charArrayOf('w', 'x', 'y', 'z')
//        val ans = ArrayList<String>()
//
//
//        backtrack(hashMap, ans, StringBuffer(), 0, digits)
//
//    }
//
//    private fun backtrack(
//        hashMap: HashMap<Char, CharArray>,
//        ans: ArrayList<String>,
//        currentString: StringBuffer,
//        current: Int,
//        digits: String
//    ) {
//        if (current == digits.length) {
//            ans.add(currentString.toString())
//        }
//
//        val digit = digits[current]
//        val letters : CharArray = hashMap[digit]
//
//    }
//}
//
//internal class Solution {
//    fun letterCombinations(digits: String): List<String> {
//        val combinations: MutableList<String> = ArrayList()
//        if (digits.isEmpty()) {
//            return combinations
//        }
//        val phoneMap: Map<Char?, String?> = object : HashMap<Char?, String?>() {
//            init {
//                put('2', "abc")
//                put('3', "def")
//                put('4', "ghi")
//                put('5', "jkl")
//                put('6', "mno")
//                put('7', "pqrs")
//                put('8', "tuv")
//                put('9', "wxyz")
//            }
//        }
//        backtrack(combinations, phoneMap, digits, 0, StringBuffer())
//        return combinations
//    }
//
//    fun backtrack(
//        combinations: MutableList<String>,
//        phoneMap: Map<Char?, String?>,
//        digits: String,
//        index: Int,
//        combination: StringBuffer
//    ) {
//        if (index == digits.length) {
//            combinations.add(combination.toString())
//        } else {
//            val digit = digits[index]
//            val letters = phoneMap[digit]
//            val lettersCount = letters!!.length
//            for (i in 0 until lettersCount) {
//                combination.append(letters[i])
//                backtrack(combinations, phoneMap, digits, index + 1, combination)
//                combination.deleteCharAt(index)
//            }
//        }
//    }
//}