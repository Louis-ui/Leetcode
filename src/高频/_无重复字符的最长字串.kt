package 高频

class _无重复字符的最长字串 {
}

//class Solution {
//    fun lengthOfLongestSubstring(s: String): Int {
//        // 哈希集合，记录每个字符是否出现过
//        val occ: MutableSet<Char> = HashSet()
//        val n = s.length
//        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
//        var rk = -1
//        var ans = 0
//        for (i in 0 until n) {
//            if (i != 0) {
//                // 左指针向右移动一格，移除一个字符
//                occ.remove(s[i - 1])
//            }
//            while (rk + 1 < n && !occ.contains(s[rk + 1])) {
//                // 不断地移动右指针
//                occ.add(s[rk + 1])
//                ++rk
//            }
//            // 第 i 到 rk 个字符是一个极长的无重复字符子串
//            ans = Math.max(ans, rk - i + 1)
//        }
//        return ans
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.lengthOfLongestSubstring("abc")
//}