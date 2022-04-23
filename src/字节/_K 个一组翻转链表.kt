package 字节

class `_K 个一组翻转链表` {
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
//    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
//        var head = head
//        val hair = ListNode(0)
//        hair.next = head
//        var pre: ListNode? = hair
//        while (head != null) {
//            var tail = pre
//            // 查看剩余部分长度是否大于等于 k
//            for (i in 0 until k) {
//                tail = tail!!.next
//                if (tail == null) {
//                    return hair.next
//                }
//            }
//            val nex = tail!!.next
//            val reverse = myReverse(head, tail)
//            head = reverse[0]
//            tail = reverse[1]
//            // 把子链表重新接回原链表
//            pre!!.next = head
//            tail.next = nex
//            pre = tail
//            head = tail.next
//        }
//        return hair.next
//    }
//
//    fun myReverse(head: ListNode, tail: ListNode?): Array<ListNode> {
//        var prev = tail!!.next
//        var p: ListNode? = head
//        while (prev != tail) {
//            val nex = p!!.next
//            p.next = prev
//            prev = p
//            p = nex
//        }
//        return arrayOf(tail, head)
//    }
//}

//class ListNode(var `val`: Int) {
//    var next: ListNode? = null
//}

//class Solution {
//    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
//        var temp = head
//        var before : ListNode? = null
//        var nextGroup : ListNode? = null
//        var tail = head
//        var curNumber = 0
//        while (temp!=null){
//            for (i in 0 until k){
//                if (tail!=null){
//                    tail = tail.next
//                }else{
//
//                }
//            }
//        }
//
//
//    }
//
//    fun reverseList(head: ListNode?): ListNode? {
//        var temp1 : ListNode? = null
//        var temp2 = head
//        while (temp2 != null) {
//            var newTemp = temp2.next
//            temp2.next = temp1
//            temp1 = temp2
//            temp2 = newTemp
//        }
//        return temp1
//    }
//}