package 腾讯


class 构造二叉树 {
}

//class TreeNode(var `val`: Int) {
//    var left: TreeNode? = null
//    var right: TreeNode? = null
//}
//
//class Solution {
//    var inorderHashMap = HashMap<Int, Int>()
//    fun buildMyTree(
//        inorder: IntArray,
//        postorder: IntArray,
//        preStart: Int,
//        preEnd: Int,
//        afterStart: Int,
//        afterEnd: Int
//    ): TreeNode? {
//       if(preEnd-preStart<0) return null
//        val root = postorder[afterEnd]
//        var rootIndex = inorderHashMap[root]!!
//        val rootNode = TreeNode(root)
//        val leftSize = rootIndex-preStart
//        rootNode.left = buildMyTree(
//            inorder,
//            postorder,
//            preStart,
//            rootIndex-1,
//            afterStart,
//            afterStart+leftSize-1
//
//        )
//        rootNode.right = buildMyTree(
//            inorder,
//            postorder,
//            rootIndex+1,
//            preEnd,
//             preStart+leftSize,
//            afterEnd-1
//        )
//        return rootNode
//    }
//
//    fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
//        for (i in inorder.indices) {
//            inorderHashMap[inorder[i]] = i
//        }
//        return buildMyTree(inorder, postorder, 0, inorder.size - 1, 0, postorder.size - 1)
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    solution.buildTree(intArrayOf(1, 2, 3, 4), intArrayOf(3,4,2,1))
//}


//class Solution {
//    var inorderHashMap = HashMap<Int, Int>()
//    fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
//        for (i in inorder.indices) {
//            inorderHashMap[inorder[i]] = i
//        }
//        return traversal(inorder, 0, inorder.size, postorder, 0, postorder.size)
//    }
//
//    fun traversal(
//        inorder: IntArray, inStart: Int, inEnd: Int,
//        postorder: IntArray, postStart: Int, postEnd: Int
//    ): TreeNode? {
//        if (inEnd - inStart < 1) return null
//        val rootVal = postorder[postEnd - 1]
//        val root = TreeNode(rootVal)
//        val rootIndex = inorderHashMap[rootVal]!!
//        root.left = traversal(
//            inorder, inStart, rootIndex,
//            postorder, postStart, postStart + rootIndex - inStart
//        )
//        root.right = traversal(
//            inorder, rootIndex + 1, inEnd,
//            postorder, postStart + rootIndex - inStart, postEnd - 1
//        )
//        return root
//    }
//}
