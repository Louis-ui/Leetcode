package 未分类

class _744_寻找比目标字母大的最小字母 {
}

class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var left = 0
        var right = letters.size - 1
        if (target.toInt() >= letters[right].toInt()) return letters[0]
        while (left < right) {
            var mid = left + (right - left) / 2
            if (target.toInt() >= letters[mid].toInt()) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return letters[left]
    }
}


fun main() {

}

internal class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        val length = letters.size
        if (target >= letters[length - 1]) {
            return letters[0]
        }
        var low = 0
        var high = length - 1
        while (low < high) {
            val mid = (high - low) / 2 + low
            if (letters[mid] > target) {
                high = mid
            } else {
                low = mid + 1
            }
        }
        return letters[low]
    }
}