package 字节

class _删除排序链表中的重复元素 {
}

//class Solution {
//    fun deleteDuplicates(head: ListNode?): ListNode? {
//        if (head == null) return null
//        if (head.next == null) return head
//        var before = head
//        var cur = head.next
//        while (cur != null) {
//            if (before!!.`val` == cur.`val`) {
//                var nex = cur.next
//                before.next = nex
//                cur = null
//                cur = nex
//            } else {
//                cur = cur.next
//                before = before.next
//            }
//        }
//        return head
//    }
//}