package 绝活

class _接口回调 {
}

interface CallBack {
    fun onAddressGet(address: String)
}

class A (val b : B){
    fun showAddress(){
        b.getAddress(object : CallBack {
            override fun onAddressGet(address: String) {
                b.getAddress(object : CallBack {
                    override fun onAddressGet(address: String) {
                        b.getAddress(object : CallBack {
                            override fun onAddressGet(address: String) {
                                b.getAddress(object : CallBack {
                                    override fun onAddressGet(address: String) {
                                        b.getAddress(object : CallBack {
                                            override fun onAddressGet(address: String) {
                                                b.getAddress(object : CallBack {
                                                    override fun onAddressGet(address: String) {
                                                        println(address)
                                                    }
                                                })
                                            }
                                        })
                                    }
                                })
                            }
                        })
                    }
                })
            }
        })
    }
}

class B  {

    private val address  = "114514"

    //异步回调
    fun getAddress(callBack: CallBack) {
        Thread {
            Thread.sleep(1000)
            callBack.onAddressGet(address)
        }.start()
    }

}

fun main() {
    val b = B()
    val a = A(b)
    a.showAddress()


}
