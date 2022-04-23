package 剑指offer

class _68 {
}

//class Solution {
//    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
//        if (root == null || p == null || q == null) return null
//        if (root.`val` < p.`val` && root.`val` < q.`val`) return lowestCommonAncestor(root.right, p, q)
//        if (root.`val` > p.`val` && root.`val` > q.`val`) return lowestCommonAncestor(root.left, p, q)
//        return root
//    }
//}