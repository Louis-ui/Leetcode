package 字节

class `_删除排序链表中的重复元素 II` {
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
//    fun deleteDuplicates(head: ListNode?): ListNode? {
//        if (head == null) return null
//        if (head.next == null) return head
//        val hair = ListNode(0)
//        var temp = head
//        var tail = head.next
//        var before = hair
//        hair.next = head
//        while (temp != null && tail != null) {
//            if (temp.`val` == tail.`val`) {
//                tail = tail.next
//                if (tail == null){
//                    before.next = null
//                }
//            } else {
//                if (temp.next != tail) {
//                    before.next = tail
//                    temp = tail
//                    tail = tail.next
//                } else {
//                    before = before.next!!
//                    tail = tail.next
//                    temp = temp.next
//                }
//
//            }
//        }
//        return hair.next
//    }
//
//}
//
//fun main() {
//    var solution = Solution()
//    var node1 = ListNode(1)
//    var node2 = ListNode(1)
////    var node3 = ListNode(3)
////    var node4 = ListNode(4)
////    var node5 = ListNode(5)
////    var node6 = ListNode(6)
//    node1.next = node2
////    node2.next = node3
////    node3.next = node4
////    node4.next = node5
////    node5.next = node6
//    solution.deleteDuplicates(node1)
//}