package 牛客

class 修剪叶子 {
}

//object Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     *
//     * @param root TreeNode类
//     * @return TreeNode类
//     */
//    fun pruneLeaves(root: TreeNode?): TreeNode? {
//        // write code here
//        if (root == null) return null
//        if (root.left!=null && root.left!!.left == null && root.left!!.right==null) return null
//        if (root.right!=null && root.right!!.left == null && root.right!!.right==null) return null
//        root.left = pruneLeaves(root.left)
//        root.right = pruneLeaves(root.right)
//        return root
//    }
//
//
//}
//
//class TreeNode(var `val`: Int) {
//    var left: TreeNode? = null
//    var right: TreeNode? = null
//}
//
//fun main() {
//}