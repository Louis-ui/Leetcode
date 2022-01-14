package 剑指offer

class _24_反转链表 {
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

//internal class Solution {
//    fun reverseList(head: ListNode?): ListNode? {
//        var prev: ListNode? = null
//        var curr = head
//        while (curr != null) {
//            val next = curr.next
//            curr.next = prev
//            prev = curr
//            curr = next
//        }
//        return prev
//    }
//}
//
//
//class Solution {
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
//
//class Solution {
//
//    var last : ListNode? = null
//
//    fun reverseList(head: ListNode?): ListNode? {
//        if(head==null || head.next == null){
//            return head
//        }
//        var last = reverseList(head.next)
//        head.next!!.next = head
//        head.next = null
//        return last
//    }
//}

//
//class ListNode(var `val`: Int?) {
//    var next: ListNode? = null
//}


//栈
//var temp = head
//val stack: Stack<ListNode> = Stack()
//while (temp != null) {
//    stack.push(temp)
//    temp = temp.next
//}
//var newTemp: ListNode
//while (!stack.isEmpty()) {
//    newTemp = stack.pop()
//    while (!stack.isEmpty()) {
//        newTemp.next = stack.pop()
//    }
//    newTemp = newTemp.next as ListNode
//}
//newTemp.next = null