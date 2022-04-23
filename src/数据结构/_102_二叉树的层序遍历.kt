package 数据结构

import java.util.*
import kotlin.collections.ArrayList


class _102_二叉树的层序遍历 {
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
//    fun levelOrder(root: TreeNode?): List<List<Int>> {
//        val ans = mutableListOf<List<Int>>()
//        if (root == null) return ans
//        val queen = LinkedList<TreeNode>()
//        queen.offer(root)
//        while (!queen.isEmpty()) {
//            val level = ArrayList<Int>()
//            var currentLevelSize = queen.size
//            for (i in 1..currentLevelSize) {
//                val temp = queen.poll()
//                level.add(temp.`val`)
//                if (temp.left != null) {
//                    queen.offer(temp.left!!)
//                }
//                if (temp.right != null) {
//                    queen.offer(temp.right!!)
//                }
//            }
//            ans.add(level)
//        }
//        return ans
//    }
//}

//class TreeNode(var `val`: Int) {
//    var left: TreeNode? = null
//    var right: TreeNode? = null
//}

//internal class Solution {
//    fun levelOrder(root: TreeNode?): List<List<Int>> {
//        val ret: MutableList<List<Int>> = ArrayList()
//        if (root == null) {
//            return ret
//        }
//        val queue: Queue<TreeNode?> = LinkedList()
//        queue.offer(root)
//        while (!queue.isEmpty()) {
//            val level: MutableList<Int> = ArrayList()
//            val currentLevelSize: Int = queue.size
//            for (i in 1..currentLevelSize) {
//                val node = queue.poll()
//                level.add(node!!.`val`)
//                if (node.left != null) {
//                    queue.offer(node.left)
//                }
//                if (node.right != null) {
//                    queue.offer(node.right)
//                }
//            }
//            ret.add(level)
//        }
//        return ret
//    }
//}

//class Solution {
//    fun levelOrder(root: TreeNode?): List<List<Int>> {
//        val ans = mutableListOf<List<Int>>()
//        if (root == null) return ans
//        val queen = LinkedList<TreeNode>()
//        queen.offer(root)
//        while (!queen.isEmpty()) {
//            val level = ArrayList<Int>(queen.size)
//            for (i in 1..level.size) {
//                val temp = queen.poll()
//                level.add(temp.`val`)
//                if (temp.left != null) {
//                    queen.offer(temp.left!!)
//                }
//                if (temp.right != null) {
//                    queen.offer(temp.right!!)
//                }
//            }
//            ans.add(level)
//        }
//        return ans
//    }
//}