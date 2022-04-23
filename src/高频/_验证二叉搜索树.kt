package 高频

class _验证二叉搜索树 {
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
//class TreeNode(var `val`: Int) {
//    var left: TreeNode? = null
//    var right: TreeNode? = null
//}
//
//class Solution {
//    fun isValidBST(root: TreeNode?): Boolean {
//        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE)
//    }
//
//    fun isValidBST(node: TreeNode?, lower: Long, upper: Long): Boolean {
//        if (node == null) {
//            return true
//        }
//        return if (node.`val` <= lower || node.`val` >= upper) {
//            false
//        } else isValidBST(node.left, lower, node.`val`.toLong()) && isValidBST(node.right, node.`val`.toLong(), upper)
//    }
//}
//
//fun main() {
//    val solution = Solution()
//    val node1 = TreeNode(1)
//    val node2 = TreeNode(1)
//    node1.left = node2
//    solution.isValidBST(node1)
//}