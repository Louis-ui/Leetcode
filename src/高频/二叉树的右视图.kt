package 高频

import java.util.LinkedList

class 二叉树的右视图 {
}

//class Solution {
//    fun rightSideView(root: TreeNode?): List<Int> {
//        if (root == null) return ArrayList<Int>()
//        val ans = ArrayList<Int>()
//        val queue = LinkedList<TreeNode>()
//        queue.offer(root)
//        while (!queue.isEmpty()) {
//            val size = queue.size
//            for (i in 0 until size) {
//                val node = queue.poll()
//                node.left?.let { queue.offer(it) }
//                node.right?.let { queue.offer(it) }
//                if (i == size - 1) ans.add(node.`val`)
//            }
//        }
//        return ans
//    }
//}