package 绝活

class _接口默认方法 {
}

internal interface InterfaceOne {
    val message: String?
        get() = "哈哈哈"

    companion object {
        fun show() {
            println("接口中的静态方法")
        }
    }

}


fun main() {
    InterfaceOne.show()
}