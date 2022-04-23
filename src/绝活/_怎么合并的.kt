package 绝活

import 剑指offer.ListNode

class _怎么合并的 {
}

fun mergeTwoLists(a: ListNode?, b: ListNode?): ListNode? {
    if (a == null || b == null) {
        return a ?: b
    }
    val head = ListNode(0)
    var tail: ListNode? = head
    var aPtr = a
    var bPtr = b
    while (aPtr != null && bPtr != null) {
        if (aPtr.`val` < bPtr.`val`) {
            tail!!.next = aPtr
            aPtr = aPtr.next
        } else {
            tail!!.next = bPtr
            bPtr = bPtr.next
        }
        tail = tail.next
    }
    tail!!.next = aPtr ?: bPtr
    return head.next
}

fun main() {
    var a = ListNode(1)
    var b = ListNode(4)
    var c = ListNode(2)
    var d = ListNode(3)
    var e = ListNode(5)
    a.next = c
    c.next = d
    b.next = e
    mergeTwoLists(a,b)

}