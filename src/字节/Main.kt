package 字节

import java.util.Scanner

//fun main(args: Array<String>) {
//    val sc = Scanner(System.`in`)
//    val stringBuffer = StringBuffer()
//    var boolean = true
//    var length: Int = 0
//    var a = ""
//    while (sc.hasNextLine()) {
//        a = sc.nextLine()
//        length = a.length
//        var i = 0
//        while (i < length) {
//            val b = a[i]
//            if (b == '(') {
//                boolean = false
//            }else if (b == ')'){
//                boolean = true
//            }
//            else if (b == '<') {
//                stringBuffer.deleteCharAt(stringBuffer.lastIndex)
//            } else if (boolean) {
//                stringBuffer.append(b)
//            }
//            i++
//        }
//        print(stringBuffer.toString())
//    }
//
//}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val total = sc.nextInt()
    val array = IntArray(total)
    for (i in 0 until total){
        array[i] = sc.nextInt()
    }
    var dp = IntArray(total)
    dp[0] = array[0]
    dp[1] = array[1]
    for (j in 1 until total){
        dp[j] = Math.max(array[j]+dp[j-1],dp[j-1])
    }
    print(dp[total-1])

}