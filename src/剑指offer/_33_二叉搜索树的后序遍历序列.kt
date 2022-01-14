package 剑指offer

class _33_二叉搜索树的后序遍历序列 {

}

//class Solution {
//    fun verifyPostorder(postorder: IntArray): Boolean {
//        return recur(postorder, 0, postorder.size - 1)
//    }
//
//    fun recur(postorder: IntArray, i: Int, j: Int): Boolean {
//        if (i >= j) return true
//        var p = i
//        while (postorder[p] < postorder[j]) p++
//        val m = p
//        while (postorder[p] > postorder[j]) p++
//        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1)
//    }
//}


//class Solution {
//    fun verifyPostorder(postorder: IntArray): Boolean {
//        if (postorder.size >= 3) {
//            var root = 0
//            postorder[postorder.size - 1].let { root = it }
//            if (postorder[postorder.size - 2] > root
//                && postorder[postorder.size - 3] < root
//                && postorder[postorder.size - 2] > postorder[postorder.size - 3]
//            ) {
//                val smallArray = IntArray(postorder.size - 2)
//                for (i in 0..postorder.size - 3) {
//                    smallArray[i] = postorder[i]
//                }
//                return verifyPostorder(smallArray)
//            } else if (postorder[postorder.size - 2] > root
//                && postorder[postorder.size - 3] > root
//                && postorder[postorder.size - 2] < postorder[postorder.size - 3]
//            ) {
//                val smallArray = IntArray(postorder.size - 1)
//                for (i in 0..postorder.size - 2) {
//                    smallArray[i] = postorder[i]
//                }
//                return verifyPostorder(smallArray)
//            } else if (postorder[postorder.size - 2] < root
//                && postorder[postorder.size - 3] > root
//            ) {
//                return false
//            } else if (postorder[postorder.size - 2] < root
//                && postorder[postorder.size - 3] < root
//            ) {
//                return false
//            }
//
//        } else {
//            return true
//        }
//        return false
//    }
//}

//fun main() {
//    var solution = Solution()
//    solution.verifyPostorder(intArrayOf(4, 8, 6, 12, 16, 14, 10))
//}