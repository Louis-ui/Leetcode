package 高频

class _两数相加 {
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

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
    class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
 */

//class ListNode(var `val`: Int) {
//    var next: ListNode? = null
//}

//class Solution {
//    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
//        var l1 = l1
//        var l2 = l2
//        var head: ListNode? = null
//        var tail: ListNode? = null
//        var carry = 0
//        while (l1 != null || l2 != null) {
//            val n1 = l1?.`val` ?: 0
//            val n2 = l2?.`val` ?: 0
//            val sum = n1 + n2 + carry
//            if (head == null) {
//                tail = ListNode(sum % 10)
//                head = tail
//            } else {
//                tail!!.next = ListNode(sum % 10)
//                tail = tail.next
//            }
//            carry = sum / 10
//            if (l1 != null) {
//                l1 = l1.next
//            }
//            if (l2 != null) {
//                l2 = l2.next
//            }
//        }
//        if (carry > 0) {
//            tail!!.next = ListNode(carry)
//        }
//        return head
//    }
//}