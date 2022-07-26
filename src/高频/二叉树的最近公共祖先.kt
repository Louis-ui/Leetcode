package 高频

class 二叉树的最近公共祖先 {
}

//class Solution {
//    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
//        if (root == null) return null
//        if (root == p || root == q) return root
//        val left = lowestCommonAncestor(root.left, p, q)
//        val right = lowestCommonAncestor(root.right, p, q)
//        if (left != null && right != null) return root
//        if (left == null && right == null) return null
//        return left ?: right
//    }
//}