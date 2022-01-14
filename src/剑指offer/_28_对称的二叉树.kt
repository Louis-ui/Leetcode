package 剑指offer

import java.util.*

class _28_对称的二叉树 {
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
//    fun isSymmetric(root: TreeNode?): Boolean {
//        if (root == null) return true
//        val totalList = ArrayList<ArrayList<TreeNode>>()
//        val queue = object : LinkedList<TreeNode>() {
//            init {
//                this.offer(root)
//            }
//        }
//        while (!queue.isEmpty()) {
//            val list = ArrayList<TreeNode>()
//            val size = queue.size
//            for (i in 0 until size) {
//                val cur = queue.poll()
//                cur.left?.let { queue.offer(it) }
//                cur.right?.let { queue.offer(it) }
//            }
//            for (j in queue) {
//                list.add(j)
//            }
//            totalList.add(list)
//        }
//        for (k in totalList) {
//            if (k.size==1) return false
//            var temp1 = 0
//            var temp2 = k.size - 1
//            while (k[temp1].`val` == k[temp2].`val`) {
//                temp1++
//                temp2--
//                if (temp1 > temp2){
//                    continue
//                }
//            }
//            if (k[temp1].`val` != k[temp2].`val`) return false
//        }
//        return true
//    }
//}
//
//class Solution {
//    fun isSymmetric(root: TreeNode?): Boolean {
//        return if (root == null) true else recur(root.left, root.right)
//    }
//
//    fun recur(L: TreeNode?, R: TreeNode?): Boolean {
//        if (L == null && R == null) return true
//        return if (L == null || R == null || L.`val` != R.`val`) false else recur(L.left, R.right) && recur(
//            L.right,
//            R.left
//        )
//    }
//}