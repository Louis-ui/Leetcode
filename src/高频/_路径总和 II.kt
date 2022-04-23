package 高频

import java.util.*
import kotlin.collections.ArrayList


class `_路径总和 II` {
}

//class Solution {
//    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
//        val ans = ArrayList<ArrayList<Int>>()
//        dfs(root, targetSum, ArrayList(), ans)
//        return ans
//    }
//
//    fun dfs(root: TreeNode?, remain: Int, list: ArrayList<Int>, ans: ArrayList<ArrayList<Int>>) {
//        if (root == null) return
//        list.add(root.`val`)
//        if (root.left == null && root.right == null && root.`val` == remain) {
//            ans.add(list)
//        }
//        dfs(root.left, (remain - root.`val`), ArrayList(list), ans)
//        dfs(root.right, (remain - root.`val`), ArrayList(list), ans)
//
//    }
//
//}
//
//
//internal class Solution {
//    var ret: MutableList<List<Int>> = LinkedList()
//    var path: Deque<Int> = LinkedList()
//    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
//        dfs(root, targetSum)
//        return ret
//    }
//
//    fun dfs(root: TreeNode?, targetSum: Int) {
//        var targetSum = targetSum
//        if (root == null) {
//            return
//        }
//        path.offerLast(root.`val`)
//        targetSum -= root.`val`
//        if (root.left == null && root.right == null && targetSum == 0) {
//            ret.add(LinkedList(path))
//        }
//        dfs(root.left, targetSum)
//        dfs(root.right, targetSum)
//        path.pollLast()
//    }
//}