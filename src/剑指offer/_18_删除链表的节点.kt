package 剑指offer

class _18_删除链表的节点 {
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
//class Solution {
//    fun deleteNode(head: ListNode?, `val`: Int): ListNode? {
//        var temp = head
//        if (temp?.`val` == `val`) return temp.next
//        while (temp?.next != null) {
//            if (temp!!.next?.`val` == `val`) {
//                var mid = temp.next
//                temp.next = mid?.next
//                mid?.next = null
//                return head
//            }
//            temp = temp.next
//        }
//        return head
//    }
//}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}