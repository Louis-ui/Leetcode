package 娱乐

import java.util.*
import kotlin.collections.ArrayList

class _迭代实现前序遍历 {
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
//
//    var stack = Stack<TreeNode>()
//    var ans = ArrayList<Int>()
//
//    fun preorderTraversal(root: TreeNode?): List<Int> {
//        root?.let { stack.push(it) }
//        while (!stack.isEmpty()){
//            val temp = stack.pop()
//            temp.right?.let { stack.push(it) }
//            temp.left?.let { stack.push(it) }
//            ans.add(temp.`val`)
//        }
//        return ans
//
//    }
//}