package 腾讯

class _情侣牵手 {
}


//class Solution {
//    fun minSwapsCouples(row: IntArray): Int {
//        val len = row.size
//        val N = len / 2
//        val unionFind = UnionFind(N)
//        var i = 0
//        while (i < len) {
//            unionFind.union(row[i] / 2, row[i + 1] / 2)
//            i += 2
//        }
//        return N - unionFind.count
//    }
//
//    private inner class UnionFind(var count: Int) {
//        private val parent: IntArray = IntArray(count)
//
//        init {
//            for (i in 0 until count) {
//                parent[i] = i
//            }
//        }
//
//        fun find(x: Int): Int {
//            var x = x
//            while (x != parent[x]) {
//                parent[x] = parent[parent[x]]
//                x = parent[x]
//            }
//            return x
//        }
//
//        fun union(x: Int, y: Int) {
//            val rootX = find(x)
//            val rootY = find(y)
//            if (rootX == rootY) {
//                return
//            }
//            parent[rootX] = rootY
//            count--
//        }
//    }
//}