package 剑指offer

import java.util.*

class _27_二叉树的镜像 {
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
//    fun mirrorTree(root: TreeNode?): TreeNode? {
//        if (root == null) return null
//        val queue = object : LinkedList<TreeNode>() {
//            init {
//                this.offer(root)
//            }
//        }
//        while (!queue.isEmpty()) {
//            val size = queue.size
//            for (i in 0 until size) {
//                val cur = queue.poll()
//                val mid = cur.left
//                cur.left = cur.right
//                cur.right = mid
//                cur.left?.let { queue.offer(it) }
//                cur.right?.let { queue.offer(it) }
//            }
//        }
//        return root
//    }
//}