package 剑指offer

class `_32 - II_从上到下打印二叉树 II` {
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
//
//        levels[level].add(node.`val`)
//
//
//        leftRight(node.left, level + 1)
//        leftRight(node.right, level + 1)
//
//    }
//}