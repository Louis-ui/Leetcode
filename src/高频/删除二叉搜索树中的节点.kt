package 高频

class 删除二叉搜索树中的节点 {
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
//    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
//        if (root == null) return null
//        var l = deleteNode(root.left, key)
//        var r = deleteNode(root.right, key)
//        if (root.`val` == key) {
//            return if (r == null && l == null) {
//                null
//            }else if (r != null) {
//                r
//            }else if (l != null) {
//                l
//            }else{
//                var successor = root.right
//                while (successor!!.left != null) {
//                    successor = successor.left
//                }
//                successor.right = root.right
//                successor.left = root.left
//                successor
//            }
//        }else{
//            return root
//        }
//    }
//}
//
//internal class Solution {
//    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
//        if (root == null) {
//            return null
//        }
//        if (root.`val` > key) {
//            root.left = deleteNode(root.left, key)
//            return root
//        }
//        if (root.`val` < key) {
//            root.right = deleteNode(root.right, key)
//            return root
//        }
//        if (root.`val` == key) {
//            if (root.left == null && root.right == null) {
//                return null
//            }
//            if (root.right == null) {
//                return root.left
//            }
//            if (root.left == null) {
//                return root.right
//            }
//            var successor = root.right
//            while (successor!!.left != null) {
//                successor = successor.left
//            }
//            root.right = deleteNode(root.right, successor.`val`)
//            successor.right = root.right
//            successor.left = root.left
//            return successor
//        }
//        return root
//    }
//}
//
