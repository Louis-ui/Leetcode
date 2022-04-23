package 剑指offer

import java.util.*

class _06_从尾到头打印链表 {
}


///**
// * Example:
// * var li = ListNode(5)
// * var v = li.`val`
// * Definition for singly-linked list.
// * class ListNode(var `val`: Int) {
// *     var next: ListNode? = null
// * }
// */
//class Solution {
//    fun reversePrint(head: ListNode?): IntArray {
//        var temp:ListNode? = head
//        val stack:Stack<ListNode> = Stack<ListNode>()
//        while (temp!=null){
//            stack.push(temp)
//            temp = temp.next
//        }
//        val size = stack.size
//        val print = IntArray(size)
//        for (i in print.indices){
//            print[i] = stack.pop().`val`
//        }
//        return print
//    }
//}
//
//class ListNode(var `val`: Int) {
//    var next: ListNode? = null
//}