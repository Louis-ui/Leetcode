package 剑指offer


class `_32 - I_从上到下打印二叉树` {
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
//    var list: MutableList<TreeNode> = mutableListOf<TreeNode>()
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
//            var queue : Queue<TreeNode> = LinkedList()
//            queue.add(root)
//            while (!queue.isEmpty()){
//                var node = queue.poll()
//                list.add(node)
//                node.left?.let { it -> queue.add(it) }
//                node.right?.let { it -> queue.add(it) }
//            }
//        }
//        return list
//    }
//}

//class Solution {
//    var levels: MutableList<MutableList<Int>> = ArrayList()
//    var ans: MutableList<Int> = ArrayList()
//    fun levelOrder(root: TreeNode?): IntArray {
//        if (root == null) {
//            return IntArray(0)
//        }
//        leftRight(root, 0)
//        for (list in levels) {
//            ans.addAll(list)
//        }
//        val result = IntArray(ans.size)
//        for (i in ans.indices) {
//            result[i] = ans[i]
//        }
//        return result
//    }
//
//    fun leftRight(node: TreeNode?, level: Int) {
//        if (node == null) {
//            return
//        }
//        if (levels.size == level) {
//            levels.add(ArrayList())
//        }
//
//        // fulfil the current level
//        levels[level].add(node.`val`)
//
//        // process child nodes for the next level
//        leftRight(node.left, level + 1)
//        leftRight(node.right, level + 1)
//    }
//}

//class TreeNode(var `val`: Int) {
//    var left: TreeNode? = null
//    var right: TreeNode? = null
//}
