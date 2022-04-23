package 腾讯

import java.util.LinkedList

class 二叉树的深度 {
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
//    fun maxDepth(root: TreeNode?): Int {
//        var queue = LinkedList<TreeNode>()
//        if (root == null) return 0
//        queue.add(root)
//        var depth = 0
//        while (queue.isNotEmpty()) {
//            depth++
//            var size = queue.size
//            for (i in 0 until size) {
//                var node = queue.poll()
//                node.left?.let { queue.add(it) }
//                node.right?.let { queue.add(it) }
//            }
//        }
//        return depth
//    }
//}
