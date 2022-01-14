package 字节

import java.util.*
import kotlin.collections.ArrayList


class _基于前缀的产品推荐 {
}

//class Solution {
//    fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
//        var map = HashMap<String,Int>()
//        for (i in products){
//            var temp1 = 0
//            var temp2 = 0
//            var ans = 0
//            while (temp1<i.length && temp2<searchWord.length){
//                if (i[temp1] == searchWord[temp2]){
//                    ans++
//                    temp1++
//                    temp2++
//                }else break
//            }
//            map.put(i,ans)
//        }
//        val list= ArrayList(map.entries)
//        list.sortWith(Comparator { o1, o2 ->
//            return@Comparator o1.value - o2.value
//        })
//        val res = ArrayList<ArrayList<String>>()
//        for (j in 1..searchWord.length){
//            val ares = ArrayList<String>()
//            for (k in list){
//                if (k.value>=j&& ares.size<3) ares.add(k.key)
//            }
//            res.add(ares)
//        }
//        return res
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.suggestedProducts(arrayOf("mobile","mouse","moneypot","monitor","mousepad"),"mouse")
//}