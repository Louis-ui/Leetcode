package 未分类

class _组合 {
}
//
//class Solution {
//
//    var ans = ArrayList<ArrayList<Int>>()
//    var maxLimit = 0
//    var limit = 0
//
//    fun combine(n: Int, k: Int): List<List<Int>> {
//        var track = ArrayList<Int>()
//        maxLimit = n
//        limit = k
//        backtrack(1, track)
//        return ans
//    }
//
//    fun backtrack(num: Int, track: ArrayList<Int>) {
//        if (track.size == limit) ans.add(ArrayList(track))
//        for (i in num..maxLimit){
//            track.add(i)
//            backtrack(i+1,track)
//            track.removeAt(track.size-1)
//        }
//    }
//}
