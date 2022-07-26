package 贪心

class 柠檬水找零 {
}

//class Solution {
//    fun lemonadeChange(bills: IntArray): Boolean {
//        var count5 = 0
//        var count10 = 0
//        var count20 = 0
//        for (i in bills) {
//            when (i) {
//                5 -> count5++
//                10 -> {
//                    count10++
//                    count5--
//                    if (count5<0) return false
//                }
//                20 -> {
//                    count20++
//                    if (count10>0) {
//                        count10--
//                        count5--
//                    }else{
//                        count5 -= 3
//                    }
//                    if (count10<0 || count5<0 )return false
//                }
//            }
//
//        }
//        return true
//    }
//}
//
//
//internal class Solution {
//    fun lemonadeChange(bills: IntArray): Boolean {
//        var five = 0
//        var ten = 0
//        for (bill in bills) {
//            if (bill == 5) {
//                five++
//            } else if (bill == 10) {
//                if (five == 0) {
//                    return false
//                }
//                five--
//                ten++
//            } else {
//                if (five > 0 && ten > 0) {
//                    five--
//                    ten--
//                } else if (five >= 3) {
//                    five -= 3
//                } else {
//                    return false
//                }
//            }
//        }
//        return true
//    }
//}