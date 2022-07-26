package 高频

import java.util.*
import kotlin.math.absoluteValue


class `最接近原点的 K 个点` {
}

//class Solution {
//    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
//        val pointComparator = Comparator{point1 : IntArray , point2 : IntArray -> point1[0].absoluteValue - point2[0].absoluteValue}
//        points.sortedWith(pointComparator)
//        for (i in points.indices){
//
//        }
//    }
//}
//
//class Solution {
//    var rand: Random = Random()
//    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
//        val n = points.size
//        random_select(points, 0, n - 1, k)
//        return Arrays.copyOfRange(points, 0, k)
//    }
//
//    fun random_select(points: Array<IntArray>, left: Int, right: Int, k: Int) {
//        val pivotId: Int = left + rand.nextInt(right - left + 1)
//        val pivot = points[pivotId][0] * points[pivotId][0] + points[pivotId][1] * points[pivotId][1]
//        swap(points, right, pivotId)
//        var i = left - 1
//        for (j in left until right) {
//            val dist = points[j][0] * points[j][0] + points[j][1] * points[j][1]
//            if (dist <= pivot) {
//                ++i
//                swap(points, i, j)
//            }
//        }
//        ++i
//        swap(points, i, right)
//        // [left, i-1] 都小于等于 pivot, [i+1, right] 都大于 pivot
//        if (k < i - left + 1) {
//            random_select(points, left, i - 1, k)
//        } else if (k > i - left + 1) {
//            random_select(points, i + 1, right, k - (i - left + 1))
//        }
//    }
//
//    fun swap(points: Array<IntArray>, index1: Int, index2: Int) {
//        val temp = points[index1]
//        points[index1] = points[index2]
//        points[index2] = temp
//    }
//}