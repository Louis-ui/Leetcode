package 协程

import kotlin.coroutines.*

class 协程 {
}

class Solution {

    fun <R, T> launchCoroutine(receiver: R, block: suspend R.() -> T) {
        block.startCoroutine(receiver, object : Continuation<T> {
            override fun resumeWith(result: Result<T>) {

            }

            override val context: CoroutineContext
                get() = EmptyCoroutineContext


        })
    }

    fun callLaunchCoroutine(){
        launchCoroutine(ProducerScope<String>()){
            simpleFunction("1145141919810")

            produce("114514")
        }

        launchCoroutine(RestrictProducerScope<String>()){
            simpleFunction("1145141919810")

            produce("114514")
        }
    }


}

class ProducerScope<T>{
    suspend fun produce(v: T){
//        println("produce:"+v)
    }

    fun simpleFunction(v: T){

    }
}

@RestrictsSuspension
class RestrictProducerScope<T>{
    suspend fun produce(v: T){
//        println("produce:"+v)
    }

    fun simpleFunction(v: T){

    }
}

fun main() {

}