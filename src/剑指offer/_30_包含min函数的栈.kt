package 剑指offer

import java.util.*

class _30_包含min函数的栈 {
}

class MinStack() {

    /** initialize your data structure here. */


    var A: Stack<Int> = Stack()
    var B: Stack<Int> = Stack()
    fun push(x: Int) {
        A.add(x)
        if (B.empty() || B.peek() >= x) B.add(x)
    }

    fun pop() {
        if (A.pop() == B.peek()) B.pop()
    }

    fun top(): Int {
        return A.peek()
    }

    fun min(): Int {
        return B.peek()
    }

}

//fun main() {
//    var obj = MinStack()
//    obj.push(x)
//    obj.pop()
//    var param_3 = obj.top()
//    var param_4 = obj.min()
//
//}