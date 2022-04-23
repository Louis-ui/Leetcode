package 剑指offer

class _68_2 {
}

//class Solution {
//    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
//        if (root == null || p == null || q == null) return null
//        if (root.`val` == p.`val` || root.`val` == q.`val`) return root
//        val left = lowestCommonAncestor(root.left, p, q)
//        val right = lowestCommonAncestor(root.right, p, q)
//        if (left == null && right == null) {
//            return null
//        } else if (left == null && right != null) {
//            return right
//        } else if (right == null && left != null) {
//            return left
//        }
//        return null
//    }
//
//}
//
//internal class Solution {
//    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode, q: TreeNode): TreeNode? {
//        if (root == null || root == p || root == q) {
//            return root
//        }
//        val left = lowestCommonAncestor(root.left, p, q)
//        val right = lowestCommonAncestor(root.right, p, q)
//        return if (left == null && right == null) {
//            null
//        } else if (left == null && right != null) {
//            right
//        } else if (left != null && right == null) {
//            left
//        } else {
//            root
//        }
//    }
//}