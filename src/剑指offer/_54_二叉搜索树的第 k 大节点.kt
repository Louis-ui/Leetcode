package 剑指offer

import 绝活.TreeBuilder
import java.util.*

class `_54_二叉搜索树的第 k 大节点` {
}

//class Solution {
//    fun kthLargest(root: TreeNode?, k: Int): Int {
//        var a = Arraylist
//        val list = mutableListOf<Int>()
//        dfs(root, list)
//        val intArray = IntArray(list.size)
//        for (i in list.indices)
//            intArray[i] = list[i]
//        return intArray[intArray.size - k]
//    }
//
//    fun dfs(node: TreeNode?, list: MutableList<Int>) {
//        if (node != null) {
//            dfs(node.left, list)
//            list.add(node.`val`)
//            dfs(node.right, list)
//        }
//    }
//}
//
//fun main() {
//
//    intAr
//    var solution = Solution()
//    var treeBuilder = TreeBuilder()
//    println(
//        solution.kthLargest(treeBuilder.buildTree(intArrayOf(3, 1, 2, 4), intArrayOf(1, 2, 3, 4)), 1)
//    )
//}