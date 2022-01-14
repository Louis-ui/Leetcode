package 剑指offer


class _07_重建二叉树 {
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
//    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
//
//
////        var queue = LinkedList<TreeNode>()
////        while (queue!=null){
////
////        }
//
//    }
//}

//class Solution {
//    private var indexMap: MutableMap<Int, Int>? = null
//    fun myBuildTree(
//        preorder: IntArray,
//        inorder: IntArray?,
//        preorder_left: Int,
//        preorder_right: Int,
//        inorder_left: Int,
//        inorder_right: Int
//    ): TreeNode? {
//        if (preorder_left > preorder_right) {
//            return null
//        }
//
//        // 前序遍历中的第一个节点就是根节点
//        // 在中序遍历中定位根节点
//        val inorder_root = indexMap!![preorder[preorder_left]]!!
//
//        // 先把根节点建立出来
//        val root = TreeNode(preorder[preorder_left])
//        // 得到左子树中的节点数目
//        val size_left_subtree = inorder_root - inorder_left
//        // 递归地构造左子树，并连接到根节点
//        // 先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素就对应了中序遍历中「从 左边界 开始到 根节点定位-1」的元素
//        root.left = myBuildTree(
//            preorder,
//            inorder,
//            preorder_left + 1,
//            preorder_left + size_left_subtree,
//            inorder_left,
//            inorder_root - 1
//        )
//        // 递归地构造右子树，并连接到根节点
//        // 先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素就对应了中序遍历中「从 根节点定位+1 到 右边界」的元素
//        root.right = myBuildTree(
//            preorder,
//            inorder,
//            preorder_left + size_left_subtree + 1,
//            preorder_right,
//            inorder_root + 1,
//            inorder_right
//        )
//        return root
//    }
//
//    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
//        val n = preorder.size
//        // 构造哈希映射，帮助我们快速定位根节点
//        indexMap = HashMap()
//        for (i in 0 until n) {
//            (indexMap as HashMap<Int, Int>)[inorder[i]] = i
//        }
//        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1)
//    }
//}
//
//
//
//
//class TreeNode(var `val`: Int) {
//    var left: TreeNode? = null
//    var right: TreeNode? = null
//}