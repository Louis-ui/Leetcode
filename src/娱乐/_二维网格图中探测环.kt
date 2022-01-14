package 娱乐

import java.util.*


class _二维网格图中探测环 {
}

//class Solution {
//    fun containsCycle(grid: Array<CharArray>): Boolean {
//        val m = grid.size
//        val n: Int = grid[0].size
//        val uf = UnionFind(m * n)
//        for (i in 0 until m) {
//            for (j in 0 until n) {
//                if (i > 0 && grid[i][j] == grid[i - 1][j]) {
//                    if (!uf.findAndUnite(i * n + j, (i - 1) * n + j)) {
//                        return true
//                    }
//                }
//                if (j > 0 && grid[i][j] == grid[i][j - 1]) {
//                    if (!uf.findAndUnite(i * n + j, i * n + j - 1)) {
//                        return true
//                    }
//                }
//            }
//        }
//        return false
//    }
//}
//
//class UnionFind(n: Int) {
//    var parent: IntArray
//    var size: IntArray
//    var n: Int
//    var setCount: Int
//    fun findset(x: Int): Int {
//        return if (parent[x] == x) x else findset(parent[x]).also { parent[x] = it }
//    }
//
//    fun unite(x: Int, y: Int) {
//        var x = x
//        var y = y
//        if (size[x] < size[y]) {
//            val temp = x
//            x = y
//            y = temp
//        }
//        parent[y] = x
//        size[x] += size[y]
//        --setCount
//    }
//
//    fun findAndUnite(x: Int, y: Int): Boolean {
//        val parentX = findset(x)
//        val parentY = findset(y)
//        if (parentX != parentY) {
//            unite(parentX, parentY)
//            return true
//        }
//        return false
//    }
//
//    init {
//        parent = IntArray(n)
//        for (i in 0 until n) {
//            parent[i] = i
//        }
//        size = IntArray(n)
//        Arrays.fill(size, 1)
//        this.n = n
//        setCount = n
//    }
//}