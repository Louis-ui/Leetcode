package 娱乐

class _二叉树的最小深度 {
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
//
//    var ans = Int.MAX_VALUE
//
//    fun minDepth(root: TreeNode?): Int {
//        if (root == null) return 0
//        dfs(root, 0)
//        return ans
//    }
//
//    fun dfs(root: TreeNode, level: Int) {
//        var curLevel = 1
//        curLevel += level
//        if (root.left == null && root.right == null ) ans = Math.min(curLevel, ans)
//        root.left?.let { dfs(it, curLevel) }
//        root.right?.let { dfs(it, curLevel) }
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    var node1 = TreeNode(2)
//    var node2 = TreeNode(3)
//    var node3 = TreeNode(4)
//    var node4 = TreeNode(5)
//    var node5 = TreeNode(6)
//    var node6 = TreeNode(7)
//    node1.right = node2
//    node2.right = node3
//    node3.right = node4
//    node4.right = node5
//    node5.right = node6
//    solution.minDepth(node1)
//}