package 剑指offer

import java.util.*


class `_59 - II_队列的最大值` {
}

//class MaxQueue() {
//
//    var queue = LinkedList<Int>()
//    var max = LinkedList<Int>()
//
//    fun max_value(): Int {
//        if (max.isEmpty()) return -1
//        return max.first
//    }
//
//    fun push_back(value: Int) {
//        if (max.isEmpty()) max.offer(value)
//        while (max.last<value) {
//            max.removeLast()
//            if (max.isEmpty()) break
//        }
//        queue.offer(value)
//    }
//
//    fun pop_front(): Int {
//        if (queue.isEmpty()) return -1
//        val ans = queue.poll()
//        if (ans == max.first) max.poll()
//        return ans
//    }
//
//}
//
//internal class MaxQueue {
//    var queue: Queue<Int> = LinkedList()
//    var max: Deque<Int> = LinkedList()
//
//    fun max_value(): Int {
//        return if (max.isEmpty()) {
//            -1
//        } else max.peekFirst()
//    }
//
//    fun push_back(value: Int) {
//        while (!max.isEmpty() && max.peekLast() < value) {
//            max.pollLast()
//        }
//        max.offerLast(value)
//        queue.offer(value)
//    }
//
//    fun pop_front(): Int {
//        if (queue.isEmpty()) {
//            return -1
//        }
//        val ans = queue.poll()
//        if (ans == max.peekFirst()) {
//            max.pollFirst()
//        }
//        return ans
//    }
//
//}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * var obj = MaxQueue()
 * var param_1 = obj.max_value()
 * obj.push_back(value)
 * var param_3 = obj.pop_front()
 */