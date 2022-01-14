package 剑指offer

import java.util.*


class _38_字符串的排列 {
}

//internal class Solution {
//    var res: MutableList<String> = LinkedList()
//    var c: CharArray = charArrayOf()
//    fun permutation(s: String): Array<String> {
//        c = s.toCharArray()
//        dfs(0)
//        return res.toTypedArray()
//    }
//
//    fun dfs(x: Int) {
//        if (x == c.size - 1) {
//            res.add(String(c)) // 添加排列方案
//            return
//        }
//        val set = HashSet<Char>()
//        for (i in x until c.size) {
//            if (set.contains(c[i])) continue  // 重复，因此剪枝
//            set.add(c[i])
//            swap(i, x) // 交换，将 c[i] 固定在第 x 位
//            dfs(x + 1) // 开启固定第 x + 1 位字符
//            swap(i, x) // 恢复交换
//        }
//    }
//
//    fun swap(a: Int, b: Int) {
//        val tmp = c[a]
//        c[a] = c[b]
//        c[b] = tmp
//    }
//}