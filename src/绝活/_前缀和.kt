package 绝活

class _前缀和 {
}

fun main() {
    val arrayA = intArrayOf(9, 1, 2, 3, 9)
    val size = arrayA.size
    val sum = IntArray(size + 1)
    for (i in arrayA.indices) {
        sum[i + 1] = sum[i] + arrayA[i]
    }
    //想要获取arrayA从下标x到下标Y的和
    var x = 1
    var y = 3
    var ans = sum[x + y] - sum[x]
    print(ans)
}