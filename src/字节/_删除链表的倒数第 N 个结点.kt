package 字节

class `_删除链表的倒数第 N 个结点` {
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
//    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
//        val dummy = ListNode(0)
//        dummy.next = head
//        var first = head
//        var second: ListNode? = dummy
//        for (i in 0 until n) {
//            first = first!!.next
//        }
//        while (first != null) {
//            first = first.next
//            second = second!!.next
//        }
//        second!!.next = second.next!!.next
//        return dummy.next
//    }
//}