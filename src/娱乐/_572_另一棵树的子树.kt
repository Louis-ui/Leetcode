package 娱乐

class _572_另一棵树的子树 {
}

//class Solution {
//    fun isSubtree(s: TreeNode?, t: TreeNode?): Boolean {
//        return dfs(s, t)
//    }
//
//    fun dfs(s: TreeNode?, t: TreeNode?): Boolean {
//        return if (s == null) {
//            false
//        } else check(s, t) || dfs(s.left, t) || dfs(s.right, t)
//    }
//
//    fun check(s: TreeNode?, t: TreeNode?): Boolean {
//        if (s == null && t == null) {
//            return true
//        }
//        return if (s == null || t == null || s.`val` != t.`val`) {
//            false
//        } else check(s.left, t.left) && check(s.right, t.right)
//    }
//}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}