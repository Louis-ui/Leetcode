package 剑指offer

class _25_合并两个排序的链表 {
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
//    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
//        var dum = ListNode(0)
//        var cur = dum
//        var temp1 = l1
//        var temp2 = l2
//        while (temp1 != null && temp2 != null) {
//            if (temp1.`val` < temp2.`val`) {
//                cur.next = temp1
//                temp1 = temp1.next
//            } else {
//                cur.next = temp2
//                temp2 = temp2.next
//            }
//            cur = cur.next!!
//        }
//        if (temp1!=null){
//            cur.next = temp1
//        }else{
//            cur.next = temp2
//        }
//        return dum.next
//    }
//}

//class Solution {
//    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
//        if (l1 == null) return l2
//        if (l2 == null) return l1
//        if (l1.`val` <= l2.`val`) {
//            l1.next = mergeTwoLists(l1.next, l2)
//            return l1
//        } else {
//            l2.next = mergeTwoLists(l1, l2.next)
//            return l2
//        }
//    }
//}

//internal class Solution {
//    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
//        var temp1 = l1
//        var temp2 = l2
//        val dum = ListNode(0)
//        var cur: ListNode? = dum
//        while (temp1 != null && temp2 != null) {
//            if (temp1.`val` < temp2.`val`) {
//                cur!!.next = temp1
//                temp1 = temp1.next
//            } else {
//                cur!!.next = temp2
//                temp2 = temp2.next
//            }
//            cur = cur.next
//        }
//        cur!!.next = temp1 ?: temp2
//        return dum.next
//    }
//}

//fun main() {
//    var solution = Solution()
//    var n1 = ListNode(1)
//    var n2 = ListNode(2)
//    var n3 = ListNode(4)
//    var n4 = ListNode(1)
//    var n5 = ListNode(3)
//    var n6 = ListNode(4)
//    n1.next = n2
//    n2.next = n3
//    n4.next = n5
//    n5.next = n6
//
//    solution.mergeTwoLists(n1, n4)
//}