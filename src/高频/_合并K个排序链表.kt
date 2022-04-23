package 高频

class _合并K个排序链表 {
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

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

//internal class Solution {
//    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
//        return merge(lists, 0, lists.size - 1)
//    }
//
//    fun merge(lists: Array<ListNode?>, l: Int, r: Int): ListNode? {
//        if (l == r) {
//            return lists[l]
//        }
//        if (l > r) {
//            return null
//        }
//        val mid = l + r shr 1
//        return mergeTwoLists(merge(lists, l, mid), merge(lists, mid + 1, r))
//    }
//
//    fun mergeTwoLists(a: ListNode?, b: ListNode?): ListNode? {
//        if (a == null || b == null) {
//            return a ?: b
//        }
//        val head = ListNode(0)
//        var tail: ListNode? = head
//        var aPtr = a
//        var bPtr = b
//        while (aPtr != null && bPtr != null) {
//            if (aPtr.`val` < bPtr.`val`) {
//                tail!!.next = aPtr
//                aPtr = aPtr.next
//            } else {
//                tail!!.next = bPtr
//                bPtr = bPtr.next
//            }
//            tail = tail.next
//        }
//        tail!!.next = aPtr ?: bPtr
//        return head.next
//    }
//}

//class Solution {
//    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
//        var size = lists.size
//
//    }
//
//    fun feng(lists: Array<ListNode?>, first: Int, last: Int): ListNode? {
//        if (last - first > 1) {
//            val mid = first + (last - first) / 2
//            feng(lists, first, mid)
//            feng(lists, mid + 1, last)
//        }else{
//            return he(lists,first,last)
//        }
//    }
//
//    fun he(lists: Array<ListNode?>, first: Int, last: Int): ListNode? {
//        if (first == last) {
//            return lists[first]
//        }
//        val vTemp = ListNode(1)
//        var cTemp = ListNode(0)
//        if (first - last == 1) {
//            while (lists[first] != null || lists[last] != null) {
//                if (lists[first] == null) {
//                    cTemp.next = lists[last]
//                }
//                if (lists[last] == null) {
//                    cTemp.next = lists[first]
//                }
//                if (lists[first]!!.`val` > lists[last]!!.`val`) {
//                    cTemp.next = lists[last]
//                    lists[last] = lists[last]!!.next
//                } else {
//                    cTemp.next = lists[first]
//                    lists[first] = lists[first]!!.next
//                }
//                if (vTemp.`val` == 1) {
//                    vTemp.`val` = 0
//                    vTemp.next = cTemp
//                }
//                cTemp.next?.let { cTemp = it }
//            }
//        }
//        return vTemp.next
//    }
//
//}