class lfu {
}


class lfucachr(size : Int){

    val cap = size
    val keyToValue = HashMap<Int,Int>()
    val keyToFreq = HashMap<Int,Int>()
    val freqToKeys = HashMap<Int,LinkedHashSet<Int>>()

    fun get(key : Int) : Int{
        if (keyToFreq[key]==null){
            put(key,keyToValue.getOrDefault(key,0)+1)
        }
        if (keyToValue[key] == null) return -1
        return keyToValue[key]!!
    }

    fun put(key : Int ,value : Int){
        if (keyToValue.size == cap){

        }
    }

}

