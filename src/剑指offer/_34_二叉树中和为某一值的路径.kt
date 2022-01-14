package 剑指offer

class _34_二叉树中和为某一值的路径 {
}

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
//class Solution {
//    var target = 0
//    var ans = ArrayList<ArrayList<Int>>()
//    fun pathSum(root: TreeNode?, target: Int): List<List<Int>> {
//        this.target = target
//        if (root?.`val` == target) return ans
//        root?.let { dfs(root, 0, ArrayList<Int>()) }
//        return ans
//    }
//
//    fun dfs(root: TreeNode, total: Int, list: ArrayList<Int>) {
//        val newTotal = total + root.`val`
//        val newList = ArrayList<Int>()
//        newList.addAll(list)
//        newList.add(root.`val`)
//        when (true) {
//            newTotal == target -> ans.add(newList)
//            newTotal < target -> {
//                root.left?.let { it -> dfs(it, newTotal, newList) }
//                root.right?.let { it -> dfs(it, newTotal, newList) }
//            }
//        }
//    }
//}

//fun main() {
//    var solution = Solution()
//    var node1 = TreeNode(5)
//    var node2 = TreeNode(4)
//    var node3 = TreeNode(8)
//    var node4 = TreeNode(11)
//    var node5 = TreeNode(13)
//    var node6 = TreeNode(4)
//    var node7 = TreeNode(7)
//    var node8 = TreeNode(2)
//    var node9 = TreeNode(5)
//    var node10 = TreeNode(1)
//
//    node1.left = node2
//    node1.right = node3
//    node2.left = node4
//    node4.left = node7
//    node4.right = node8
//    node3.left = node5
//    node3.right = node6
//    node6.left = node9
//    node6.right = node10
//
//    solution.pathSum(node1, 22)
//}