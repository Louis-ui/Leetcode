package 字节

class ` 反转链表 II` {
}

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

//class ListNode(var `val`: Int) {
//    var next: ListNode? = null
//}
//
//internal class Solution {
//    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
//        // 因为头节点有可能发生变化，使用虚拟头节点可以避免复杂的分类讨论
//        val dummyNode = ListNode(-1)
//        dummyNode.next = head
//        var pre: ListNode? = dummyNode
//        // 第 1 步：从虚拟头节点走 left - 1 步，来到 left 节点的前一个节点
//        // 建议写在 for 循环里，语义清晰
//        for (i in 0 until left - 1) {
//            pre = pre!!.next
//        }
//
//        // 第 2 步：从 pre 再走 right - left + 1 步，来到 right 节点
//        var rightNode = pre
//        for (i in 0 until right - left + 1) {
//            rightNode = rightNode!!.next
//        }
//
//        // 第 3 步：切断出一个子链表（截取链表）
//        val leftNode = pre!!.next
//        val curr = rightNode!!.next
//
//        // 注意：切断链接
//        pre.next = null
//        rightNode.next = null
//
//        // 第 4 步：同第 206 题，反转链表的子区间
//        reverseLinkedList(leftNode)
//
//        // 第 5 步：接回到原来的链表中
//        pre.next = rightNode
//        leftNode!!.next = curr
//        return dummyNode.next
//    }
//
//    private fun reverseLinkedList(head: ListNode?) {
//        // 也可以使用递归反转一个链表
//        var pre: ListNode? = null
//        var cur = head
//        while (cur != null) {
//            val next = cur.next
//            cur.next = pre
//            pre = cur
//            cur = next
//        }
//    }
//}
//
//
//class Solution {
//    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
//        var temp = head
//        var leftTemp = head
//        var rightTemp = head
//        var leftLastTemp : ListNode? = null
//        var rightLastTemp : ListNode? = null
//        var cur = head
//        var originStartTemp : ListNode? = null
//        var curNumber = 1
//        while (temp != null) {
//            if (curNumber == left){
//                leftTemp = temp
//                originStartTemp = temp
//            }
//            if ((curNumber+1)== left && temp.next!=null){
//                leftLastTemp = temp
//                leftTemp = temp.next
//            }
//            if (curNumber ==right){
//                rightTemp = temp
//                temp.next?.let { rightLastTemp = it }
//            }
//            temp = temp.next
//            curNumber++
//        }
//        cur = leftTemp
//        var before = leftLastTemp
//        while (cur!=null && cur!=rightLastTemp){
//            var nex = cur.next
//            cur.next = before
//            before = cur
//            cur = nex
//        }
//        leftLastTemp?.let {
//            it.next!!.next = rightLastTemp
//            it.next = cur
//        }?: run {
//            originStartTemp!!.next = cur
//        }
//        return head
//    }
//}