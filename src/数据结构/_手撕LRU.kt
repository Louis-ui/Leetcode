package 数据结构

class _手撕LRU {
}

class Node(var key: Int, var `val`: Int) {
    public var next: Node? = null
    public var prev: Node? = null
}

class DoubleList() {

    private var head: Node = Node(0, 0)
    private var tail: Node = Node(0, 0)
    private var size: Int = 0

    init {
        head.next = tail
        tail.prev = head
    }

    fun addLast(node: Node) {
        node.prev = tail.prev
        node.next = tail
        tail.prev!!.next = node
        tail.prev = node
        size++
    }

    fun remove(node: Node) {
        node.prev?.next = node.next
        node.next?.prev = node.prev
        node.prev = null
        node.next = null
        size--
    }

    fun removeFirst(): Node? {
        if (head.next != tail) {
            val node = head.next!!
            remove(node)
            return node
        }
        return null
    }

    fun size(): Int {
        return size
    }

}

class LRUCache(capacity: Int) {

    private val map = HashMap<Int, Node>()
    private val cache = DoubleList()
    private val cap = capacity

    fun makeRecently(key: Int) {
        val node = map.get(key)
        node?.let {
            cache.remove(it)
            cache.addLast(node)
        }

    }

    fun addRecently(key: Int, value: Int) {
        val node = Node(key, value)
        cache.addLast(node)
        map[key] = node
    }

    fun deleteKey(key: Int) {
        val node = map[key]
        node?.let { cache.remove(it) }
        map.remove(key)
    }

    fun removeLeastRecently() {
        val node = cache.removeFirst()
        node?.let { map.remove(node.key) }
    }

    fun get(key: Int): Int {
        makeRecently(key)
        return map[key]?.`val` ?: -1
    }

    fun put(key: Int, value: Int) {
        if (map.containsKey(key)) {
            deleteKey(key)
        }
        if (cache.size() == cap) removeLeastRecently()
        addRecently(key, value)
    }

}

fun main() {
    val a = LRUCache(2)
    a.put(1, 1)
    a.put(2, 2)
    a.get(1)
    a.put(3, 3)
    a.get(2)
    a.put(4, 4)
    a.get(1)
    a.get(3)
    a.get(4)
}