package 绝活

class _堆排序 {
}

object HeapSort {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 1, 10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19)
        heapSort(arr)
        for (i in arr.indices) {
            println(arr[i])
        }
    }

    private fun heapSort(arr: IntArray) {
        // 从第一个非叶子结点开始调整堆
        for (i in arr.size / 2 - 1 downTo 0) {
            max_heapify(arr, i, arr.size)
        }

        // 调整堆结构并且交换头尾元素
        for (i in arr.size - 1 downTo 1) {
            swap(arr, 0, i)
            max_heapify(arr, 0, i)
        }
    }

    private fun swap(arr: IntArray, m: Int, n: Int) {
        val temp = arr[m]
        arr[m] = arr[n]
        arr[n] = temp
    }

    private fun max_heapify(arr: IntArray, i: Int, len: Int) {
        var i = i
        val temp = arr[i]
        // 从该结点的左结点开始
        var j = 2 * i + 1
        while (j < len) {
            // 如果左结点小于右结点，那么指向右结点
            if (j + 1 < len && arr[j + 1] > arr[j]) j++
            if (arr[j] > temp) {
                arr[i] = arr[j]
                i = j
            } else {
                break
            }
            j = j * 2 + 1
        }
        arr[i] = temp
    }
}