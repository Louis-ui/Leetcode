package 高频

import java.util.*


class _数组中的第K个最大元素 {
}

//class Solution {
//    fun findKthLargest(nums: IntArray, k: Int): Int {
//        Arrays.sort(nums)
//        return nums[nums.size-k]
//    }
//}
//
//internal class Solution {
//    fun criticalConnections(n: Int, connections: List<List<Int>>): List<List<Int>> {
//        // 构建一个map，存放每个节点的相邻节点有哪些
//        val map: MutableMap<Int, MutableSet<Int>> = HashMap()
//        buildMap(connections, map)
//
//
//        // 创建一个数组，存放每个节点的id是什么
//        val id = IntArray(n)
//        Arrays.fill(id, -1)
//
//        // 选取一个点作为根节点，dfs向下递归，过程中识别出哪个边是critical connection
//        val res: MutableList<List<Int>> = ArrayList()
//        dfs(0, 0, -1, id, map, res) // 假设根节点有一个编号是-1父节点
//        return res
//    }
//
//    fun dfs(
//        node: Int,
//        nodeID: Int,
//        par: Int,
//        id: IntArray,
//        map: Map<Int, MutableSet<Int>>,
//        res: MutableList<List<Int>>
//    ): Int {
//        id[node] = nodeID
//        val set: Set<Int> = map[node]!!
//        for (neighbor in set) {
//            if (neighbor == par) {
//                continue
//            } else if (id[neighbor] == -1) {
//                id[node] = Math.min(id[node], dfs(neighbor, nodeID + 1, node, id, map, res))
//            } else {
//                id[node] = Math.min(id[node], id[neighbor])
//            }
//        }
//        if (id[node] == nodeID && node != 0) {
//            res.add(Arrays.asList(par, node))
//        }
//        return id[node]
//    }
//
//    fun buildMap(con: List<List<Int>>, map: MutableMap<Int, MutableSet<Int>>) {
//        for (edge in con) {
//            val n1 = edge[0]
//            val n2 = edge[1]
//            val n1n = map.getOrDefault(n1, HashSet())
//            val n2n = map.getOrDefault(n2, HashSet())
//            n1n.add(n2)
//            n2n.add(n1)
//            map[n1] = n1n
//            map[n2] = n2n
//        }
//    }
//}

