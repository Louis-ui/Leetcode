package 字节

class _两两交换链表中的节点 {
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
//class Solution {
//    fun swapPairs(head: ListNode?): ListNode? {
//        if (head == null) return null
//        if (head.next == null) return head
//        val hair = ListNode(0)
//        var before = hair
//        var cur = head
//        var tail = head
//        while (tail != null) {
//            for (i in 0 until 1) {
//                tail = tail!!.next
//            }
//            if (tail == null) {
//                return hair.next
//            }
//            if (tail.next == null) {
//                tail.next = cur
//                cur!!.next = null
//                before.next = tail
//                return hair.next
//            }
//            val nex = tail.next
//            tail.next = cur
//            cur!!.next = nex
//            before.next = tail
//            tail = nex
//            before = cur
//            cur = nex
//        }
//        return hair.next
//    }
//}
//
//internal class Solution {
//    fun swapPairs(head: ListNode?): ListNode? {
//        val dummyHead = ListNode(0)
//        dummyHead.next = head
//        var temp: ListNode? = dummyHead
//        while (temp!!.next != null && temp.next!!.next != null) {
//            val node1 = temp.next
//            val node2 = temp.next!!.next
//            temp.next = node2
//            node1!!.next = node2!!.next
//            node2.next = node1
//            temp = node1
//        }
//        return dummyHead.next
//    }
//}
//
//fun main() {
//    var solution = Solution()
//    var node1 = ListNode(1)
//    var node2 = ListNode(2)
//    var node3 = ListNode(3)
//    node1.next = node2
//    node2.next = node3
//    solution.swapPairs(node1)
//}