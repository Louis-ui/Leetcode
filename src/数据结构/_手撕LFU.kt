package 数据结构

class _手撕LFU {
}

class LFUCache(capacity: Int) {

    private val keyToVal = HashMap<Int, Int>()
    private val keyToFreq = HashMap<Int, Int>()
    private val freqToKeys = HashMap<Int, LinkedHashSet<Int>>()
    private val cap = capacity
    private var minFreq: Int = 0


    fun get(key: Int): Int {
        if (!keyToVal.containsKey(key)) return -1
        increaseFreq(key)
        return keyToVal[key]!!
    }

    fun put(key: Int, value: Int) {
        if (cap <= 0) return
        if (keyToVal.containsKey(key)) {
            keyToFreq[key] = value
            increaseFreq(key)
            return
        }
        if (cap <= keyToVal.size) {
            removeMinFreqKey()
        }
        keyToVal[key] = value
        keyToFreq[key] = 1
        freqToKeys.putIfAbsent(1, LinkedHashSet())
        freqToKeys[1]!!.add(key)
        minFreq = 1
    }

    private fun increaseFreq(key: Int) {
        val freq = keyToFreq[key]
        freq?.let {
            keyToFreq[key] = it+1
            freqToKeys[key]?.remove(key)
            freqToKeys.putIfAbsent(it+1,LinkedHashSet())
            freqToKeys[it+1]!!.add(key)
            if (freqToKeys[it]!!.isEmpty()){
                freqToKeys.remove(it)
                if (it == minFreq) minFreq++
            }
        }
    }

    private fun removeMinFreqKey() {
        val keyList = freqToKeys[minFreq]
        val deleteKey = keyList?.iterator()?.next()
        keyList?.remove(deleteKey)
        if (keyList!!.isEmpty()) freqToKeys.remove(minFreq)
        keyToVal.remove(deleteKey)
        keyToFreq.remove(deleteKey)
    }

}

/**
 * Your LFUCache object will be instantiated and called as such:
 * var obj = LFUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */