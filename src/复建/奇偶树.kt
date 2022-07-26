package 复建

import com.sun.source.tree.Tree
import 剑指offer.TreeNode
import java.util.*
import kotlin.collections.ArrayDeque


class 奇偶树 {
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
class Solution {
    fun isEvenOddTree(root: TreeNode?): Boolean {
        if (root == null) return true
        val queue = LinkedList<TreeNode>()
        queue.offer(root)
        var isJ = false
        while (!queue.isEmpty()){
            val size = queue.size
            var before : TreeNode? = if (isJ) TreeNode(Int.MAX_VALUE) else TreeNode(Int.MIN_VALUE)
            for (i in 0 until size){
                val node = queue.poll()
                if (before == null) before = node
                if (node.left != null) {
                    queue.offer(node.left)
                }
                if (node.right != null) {
                    queue.offer(node.right)
                }
                when(isJ){
                    true -> {
                        if (node.`val`%2 == 1 || node.`val`>=before!!.`val`) return false
                    }
                    false -> {
                        if (node.`val` %2 == 0 || node.`val`<=before!!.`val`) return false
                    }
                }
                before = node
            }
            isJ = !isJ
        }
        return true
    }
}

fun main() {
    val treeNode1 = TreeNode(5)
    val treeNode2 = TreeNode(4)
    val treeNode3 = TreeNode(2)
    val treeNode4 = TreeNode(3)
    val treeNode5 = TreeNode(3)
    val treeNode6 = TreeNode(7)
    treeNode1.left = treeNode2
    treeNode1.right = treeNode3
    treeNode2.left = treeNode4
    treeNode2.right = treeNode5
    treeNode3.left = treeNode6
    var solution = Solution()
    print(solution.isEvenOddTree(treeNode1))
    
}

//internal class Solution {
//    fun isEvenOddTree(root: TreeNode?): Boolean {
//        val queue: Queue<TreeNode?> = LinkedList<TreeNode?>()
//        queue.offer(root)
//        var level = 0
//        while (!queue.isEmpty()) {
//            val size = queue.size
//            var prev = if (level % 2 == 0) Int.MIN_VALUE else Int.MAX_VALUE
//            for (i in 0 until size) {
//                val node = queue.poll()
//                val value = node!!.`val`
//                if (level % 2 == value % 2) {
//                    return false
//                }
//                if (level % 2 == 0 && value <= prev || level % 2 == 1 && value >= prev) {
//                    return false
//                }
//                prev = value
//                if (node.left != null) {
//                    queue.offer(node.left)
//                }
//                if (node.right != null) {
//                    queue.offer(node.right)
//                }
//            }
//            level++
//        }
//        return true
//    }
//}