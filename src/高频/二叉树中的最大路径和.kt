package 高频

class 二叉树中的最大路径和 {
}

//class Solution {
//
//    var max = Int.MIN_VALUE
//
//    fun maxPathSum(root: TreeNode?): Int {
//        maxGain(root)
//        return max
//    }
//
//    fun maxGain(node: TreeNode?): Int {
//        if (node == null) return 0
//        val leftGain = Math.max(maxGain(node.left), 0)
//        val rightGain = Math.max(maxGain(node.right), 0)
//        val maxPrice = node.`val` + leftGain + rightGain
//        max = Math.max(maxPrice, max)
//        return node.`val` + Math.max(leftGain, rightGain)
//    }
//}