package 剑指offer

import java.util.*


class `_55 - I_ 二叉树的深度` {
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
//    fun maxDepth(root: TreeNode?): Int {
//        if (root == null) return 0
//        var queue: LinkedList<TreeNode> = object : LinkedList<TreeNode>() {
//            init {
//                this.offer(root)
//            }
//        }
//        var ans = 0
//        var curQueue: LinkedList<TreeNode>
//        while (!queue.isEmpty()) {
//            curQueue = LinkedList()
//            for (i in queue) {
//                i.left?.let { curQueue.offer(it) }
//                i.right?.let { curQueue.offer(it) }
//            }
//            queue = curQueue
//            ans++
//        }
//        return ans
//    }
//}
