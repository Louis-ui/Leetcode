package 娱乐

class 单值二叉树 {
}

//class Solution {
//    fun isUnivalTree(root: TreeNode?): Boolean {
//        if(root==null) return true
//        if (root.left == null && root.right == null) return true
//
//        return false
//    }
//}
//
//internal class Solution {
//    fun isUnivalTree(root: TreeNode?): Boolean {
//        if (root == null) {
//            return true
//        }
//        if (root.left != null) {
//            if (root.`val` != root.left!!.`val` || !isUnivalTree(root.left)) {
//                return false
//            }
//        }
//        if (root.right != null) {
//            if (root.`val` != root.right!!.`val` || !isUnivalTree(root.right)) {
//                return false
//            }
//        }
//        return true
//    }
//}