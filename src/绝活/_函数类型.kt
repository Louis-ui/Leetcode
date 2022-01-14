package 绝活

class _函数类型 {
}

//class test(){
//    suspend fun <A: Comparable<A>,B,C> A.f01(block1: (A) -> B, block2: suspend (B)->C): suspend (A) ->C = {
//        block2(block1(if (this > it) this else it))
//    }
//
//    suspend fun <A: Comparable<A>,B,C> A.f02(block1: (A) -> B, block2: suspend (B)->C) {}
//    suspend fun  Int.f03(block1: (Int) -> Int, block2: suspend (Int)->Int) {}
//    suspend fun  Int.f04() {}
//
//
//    fun main() {
//        val a = Int::f01
//        val b = Int::f02
//        val c = Int::f03
//        val d = Int::f04
//    }
//}