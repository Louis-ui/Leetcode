package 高频

import java.util.*


class 分发饼干 {
}

//class Solution {
//    fun findContentChildren(g: IntArray, s: IntArray): Int {
//        Arrays.sort(g)
//        Arrays.sort(s)
//        var i = 0
//        while (i<s.size && s[i]<g[g.size-1]){
//            i++
//        }
//
//    }
//}
//
//internal class Solution {
//    fun findContentChildren(g: IntArray, s: IntArray): Int {
//        Arrays.sort(g)
//        Arrays.sort(s)
//        val numOfChildren = g.size
//        val numOfCookies = s.size
//        var count = 0
//        var i = 0
//        var j = 0
//        while (i < numOfChildren && j < numOfCookies) {
//            while (j < numOfCookies && g[i] > s[j]) {
//                j++
//            }
//            if (j < numOfCookies) {
//                count++
//            }
//            i++
//            j++
//        }
//        return count
//    }
//}
