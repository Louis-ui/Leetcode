package 绝活

import 剑指offer.ListNode

class _怎么引用的 {
}

fun main() {
    var a = ListNode(1)
    var b = a
    a.`val` = 2
    print(b.`val`)
}