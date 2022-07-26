package 滑动窗口和双指针

class 定长子串中元音的最大数目 {
}

//class Solution {
//    fun maxVowels(s: String, k: Int): Int {
//        var ans = 0
//        var fans = 0
//        var left = 0
//        var right = 0
//        val hashSet = object : HashSet<Char>() {
//            init {
//                this.add('a')
//                this.add('e')
//                this.add('i')
//                this.add('o')
//                this.add('u')
//            }
//        }
//
//        while (right<s.length){
//            if (hashSet.contains(s[right])){
//                ans++
//            }
//            right++
//            while (right-left>=k){
//                fans = Math.max(fans,ans)
//                if (hashSet.contains(s[left])){
//                    ans--
//                }
//                left++
//            }
//        }
//        return fans
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.maxVowels("aeiou",2)
//}


//class Solution {
//    fun maxVowels(s: String, k: Int): Int {
//        val n = s.length
//        var vowel_count = 0
//        for (i in 0 until k) {
//            vowel_count += isVowel(s[i])
//        }
//        var ans = vowel_count
//        for (i in k until n) {
//            vowel_count += isVowel(s[i]) - isVowel(s[i - k])
//            ans = Math.max(ans, vowel_count)
//        }
//        return ans
//    }
//
//    fun isVowel(ch: Char): Int {
//        return if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 1 else 0
//    }
//}