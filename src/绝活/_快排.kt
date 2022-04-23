package 绝活

class _快排 {
}

object QuickSort {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 1, 10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19)
        quickSort(arr, 0, arr.size - 1)
        for (i in arr.indices) {
            println(arr[i])
        }
    }

    private fun quickSort(arr: IntArray, low: Int, high: Int) {
        if (low >= high) {
            return
        }
        var i = low
        var j = high
        val temp = arr[low]
        while (i < j) {
            while (j > i && arr[j] >= temp) {
                j--
            }
            while (i < j && arr[i] <= temp) {
                i++
            }
            if (i < j) {
                val k = arr[i]
                arr[i] = arr[j]
                arr[j] = k
            }
        }

        // 把基准的那个交换
        arr[low] = arr[i]
        arr[i] = temp
        quickSort(arr, low, j - 1)
        quickSort(arr, j + 1, high)
    }
}

object QuickSort1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 1, 10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19)
        quickSort(arr, 0, arr.size - 1)
        for (i in arr.indices) {
            println(arr[i])
        }
    }

    private fun quickSort(arr: IntArray, low: Int, high: Int) {
        if (low >= high) return
        val index = partition(arr, low, high)
        quickSort(arr, low, index - 1)
        quickSort(arr, index + 1, high)
    }

    private fun partition(arr: IntArray, low: Int, high: Int): Int {
        val temp = arr[low]
        var i = low
        var j = high
        while (i < j) {
            while (i < j && arr[j] >= temp) {
                j--
            }
            while (i < j && arr[i] <= temp) {
                i++
            }
            if (i < j) {
                val t = arr[i]
                arr[i] = arr[j]
                arr[j] = t
            }
        }
        arr[low] = arr[j]
        arr[j] = temp
        return j
    }
}