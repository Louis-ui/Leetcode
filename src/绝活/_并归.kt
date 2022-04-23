package 绝活

class _并归 {
}

fun mergeSort(arr: IntArray) {
    if (arr.isEmpty()) return
    val result = IntArray(arr.size)
    mergeSort(arr, 0, arr.size - 1, result)
}

// 对 arr 的 [start, end] 区间归并排序
private fun mergeSort(arr: IntArray, start: Int, end: Int, result: IntArray) {
    // 只剩下一个数字，停止拆分
    if (start == end) return
    val middle = (start + end) / 2
    // 拆分左边区域，并将归并排序的结果保存到 result 的 [start, middle] 区间
    mergeSort(arr, start, middle, result)
    // 拆分右边区域，并将归并排序的结果保存到 result 的 [middle + 1, end] 区间
    mergeSort(arr, middle + 1, end, result)
    // 合并左右区域到 result 的 [start, end] 区间
    merge(arr, start, end, result)
}

// 将 result 的 [start, middle] 和 [middle + 1, end] 区间合并
private fun merge(arr: IntArray, start: Int, end: Int, result: IntArray) {
    val middle = (start + end) / 2
    // 数组 1 的首尾位置
    // 数组 2 的首尾位置
    val start2 = middle + 1
    // 用来遍历数组的指针
    var index1 = start
    var index2 = start2
    // 结果数组的指针
    var resultIndex = start
    while (index1 <= middle && index2 <= end) {
        if (arr[index1] <= arr[index2]) {
            result[resultIndex++] = arr[index1++]
        } else {
            result[resultIndex++] = arr[index2++]
        }
    }
    // 将剩余数字补到结果数组之后
    while (index1 <= middle) {
        result[resultIndex++] = arr[index1++]
    }
    while (index2 <= end) {
        result[resultIndex++] = arr[index2++]
    }
    // 将 result 操作区间的数字拷贝到 arr 数组中，以便下次比较
    for (i in start..end) {
        arr[i] = result[i]
    }
}