package 腾讯

class _翻译 {
}

//class Solution {
//    fun uniqueMorseRepresentations(words: Array<String>): Int {
//        val list = arrayListOf<String>(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
//        val ans = HashSet<String>()
//        for (i in words){
//            val buffer = StringBuffer()
//            for (j in i){
//                buffer.append(list[j.toInt()-97])
//            }
//            ans.add(buffer.toString())
//        }
//        return ans.size
//    }
//}