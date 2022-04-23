package 字节

class _2 {
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

//class TreeNode(var `val`: Int) {
//    var left: TreeNode? = null
//    var right: TreeNode? = null
//}

//class Solution {
//
//    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
//        if (root == null || subRoot == null) return false
//        if (check(root,subRoot) == true) return true
//        if (check(root.left,subRoot) == true) return true
//        if (check(root.right,subRoot) == true) return true
//        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot)
//
//    }
//
//    fun check(root: TreeNode?, subRoot: TreeNode?): Boolean {
//        if (root == null && subRoot == null) return true
//        if (root?.`val` == subRoot?.`val`) return check(root?.left, subRoot?.left) && return check(
//            root?.right,
//            subRoot?.right
//        ) else return false
//    }
//
//
//}

//fun main() {
//    var solution = Solution()
//    var node = TreeNode(1)
//    print(solution.isSubtree(node,node))
//}