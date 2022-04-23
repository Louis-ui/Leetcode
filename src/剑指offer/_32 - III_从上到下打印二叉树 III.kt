package 剑指offer

import java.util.*

class `_32 - III_从上到下打印二叉树 III` {
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
//    var levels: MutableList<MutableList<Int>> = mutableListOf()
//
//    fun levelOrder(root: TreeNode?): List<List<Int>> {
//        if (root == null) {
//            return levels
//        }
//
//        leftRight(root, 0)
//        return levels
//    }
//
//    fun leftRight(node: TreeNode?, level: Int) {
//        if (node == null) {
//            return
//        }
//        if (levels.size == level) {
//            levels.add(mutableListOf())
//        }
//        if (level % 2 === 0) {
//            levels[level].add(node.`val`)
//        } else {
//            levels[level].add(0,node.`val`)
//        }
//
//        leftRight(node.left, level + 1)
//        leftRight(node.right, level + 1)
//
//    }
//}

//class Solution {
//    var list: MutableList<TreeNode> = mutableListOf<TreeNode>()
//    var i = false
//
//    fun levelOrder(root: TreeNode?): IntArray {
//        list = getList(root)
//        val array = IntArray(list.size)
//        for (i in list.indices) {
//            array.set(i, list.get(i).`val`)
//        }
//        return array
//    }
//
//    fun getList(root: TreeNode?): MutableList<TreeNode> {
//        root?.let {
//            val queue: Queue<TreeNode> = LinkedList()
//            queue.add(root)
//            while (!queue.isEmpty()) {
//                if (i) {
//                    val node = queue.poll()
//                    list.add(node)
//                    node.left?.let { it -> queue.add(it) }
//                    node.right?.let { it -> queue.add(it) }
//                    i = !i
//                }else{
//                    val node = queue.poll()
//                    list.add(node)
//                    node.right?.let { it -> queue.add(it) }
//                    node.left?.let { it -> queue.add(it) }
//                    i = !i
//                }
//            }
//        }
//        return list
//    }
//}

//class TreeNode(var `val`: Int) {
//    var left: TreeNode? = null
//    var right: TreeNode? = null
//}