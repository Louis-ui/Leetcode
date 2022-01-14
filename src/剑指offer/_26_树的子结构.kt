package 剑指offer

class _26_树的子结构 {
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
//
//    var As = mutableListOf<TreeNode>()
//    var Bs = mutableListOf<TreeNode>()
//
//    fun isSubStructure(A: TreeNode?, B: TreeNode?): Boolean {
//        traverse(A, As)
//        traverse(B, Bs)
//        var j = 0
//        while (!Bs.isEmpty()) {
//            val top = Bs.removeAt(0)
//            for (i in As.indices) {
//                if (As[i].`val` == top.`val`) {
//                    if(Bs.isEmpty()){
//                        return true
//                    }
//                    var k = i + 1
//                    val rk = Bs.size
//                    while (!Bs.isEmpty()) {
//                        if (k>=As.size){
//                            return false
//                        }
//                        if (As[k].`val` == Bs.removeAt(0).`val`) {
//                            k++
//                        }
//                    }
//                    if (k - i - 1 - rk == 0) {
//                        return true
//                    }
//                }
//            }
//        }
//        return false
//    }
//
//    fun traverse(node: TreeNode?, list: MutableList<TreeNode>): MutableList<TreeNode> {
//        node?.let {
//            list.add(it)
//            traverse(node.left, list)
//            traverse(node.right, list)
//        }
//        return list
//    }
//
//}

//class Solution {
//    fun isSubStructure(A: TreeNode?, B: TreeNode?): Boolean {
//        if (A == null || B == null) return false
//        // 根节点相同后再进行比较子节点
//        return if (A.`val` == B.`val` && isMatch(A, B)) true else isSubStructure(A.left, B) || isSubStructure(
//            A.right,
//            B
//        )
//    }
//
//    private fun isMatch(A: TreeNode?, B: TreeNode?): Boolean {
//        if (B == null) return true
//        return if (A == null) false else A.`val` == B.`val` && isMatch(A.left, B.left) && isMatch(A.right, B.right)
//    }
//}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

//fun main() {
//    val A = TreeNode(1)
//    A.left = TreeNode(0)
//    A.right = TreeNode(1)
//    A.left!!.left = TreeNode(-4)
//    A.left!!.right = TreeNode(-3)
//
//    val B = TreeNode(1)
//    B.left = TreeNode(-4)
//    val solution = Solution()
//    print(solution.isSubStructure(A,B))
//}


