package 剑指offer

class _链表中环的入口节点 {
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

class Solution {
    fun detectCycle(head: ListNode?): ListNode? {
        if (head == null) return null
        if (head.next!=null && head.next!!.next == head) return head
        var kuai = head
        var man = head
        while (kuai != null && kuai.next != null) {
            kuai = kuai.next!!.next
            man = man!!.next
            if (man == kuai){
                break
            }
            if (kuai != null && kuai.next != null){
                return null
            }
        }
        man = head
        while (true){
            man = man!!.next
            kuai = kuai!!.next
            if (man == kuai){
                return man
            }
        }
    }
}