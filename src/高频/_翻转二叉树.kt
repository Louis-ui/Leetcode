package 高频

import java.util.*


class _翻转二叉树 {
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

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

//class Solution {
//    fun invertTree(root: TreeNode?): TreeNode? {
//        var queue1 = LinkedList<TreeNode>()
//        queue1.offer(root)
//        while (!queue1.isEmpty()) {
//            val queue2 = LinkedList<TreeNode>()
//
//            for (i in queue1){
//                val temp = queue1.poll()
//                temp?.let { val mid = temp.right
//                    temp.right = temp.left
//                    temp.left = mid
//                    queue2.offer(temp.right)
//                    queue2.offer(temp.left) }
//            }
//
//            for (i in 0 until queue1.size) {
//                val temp = queue1.poll()
//                temp?.let { val mid = temp.right
//                        temp.right = temp.left
//                    temp.left = mid
//                    queue2.offer(temp.right)
//                    queue2.offer(temp.left) }
//            }
//
//            queue1 = queue2
//        }
//        return root
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    var node1 = TreeNode(4)
//    var node2 = TreeNode(2)
//    var node3 = TreeNode(7)
//    var node4 = TreeNode(1)
//    var node5 = TreeNode(3)
//    var node6 = TreeNode(6)
//    var node7 = TreeNode(9)
//    node1.left = node2
//    node1.right = node3
//    node2.left = node4
//    node2.right = node5
//    node3.left = node6
//    node3.right = node7
//    solution.invertTree(node1)
//}
