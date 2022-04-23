package 设计模式

class _单例模式 {


}
//懒1
//class SingletonDemo private constructor() {
//    companion object {
//        private var instance: SingletonDemo? = null
//            get() {
//                if (field == null) {
//                    field = SingletonDemo()
//                }
//                return field
//            }
//
//        fun get(): SingletonDemo {
//            return instance!!
//        }
//    }
//}
////懒2
//class SingletonDemo private constructor() {
//    companion object {
//        private lateinit var instance: SingletonDemo
//
//        fun get(): SingletonDemo {
//            if (!this::instance.isInitialized) {
//                instance = SingletonDemo()
//            }
//
//            return instance
//        }
//    }
//}
////线程安全-懒
//class SingletonDemo private constructor() {
//    companion object {
//        private var instance: SingletonDemo? = null
//            get() {
//                if (field == null) {
//                    field = SingletonDemo()
//                }
//                return field
//            }
//        @Synchronized
//        fun get(): SingletonDemo{
//            return instance!!
//        }
//    }
//}

class SingletonDemo private constructor() {
    @Volatile
    var instance: SingletonDemo? = null
        get() {
            if (field == null) {
                synchronized(SingletonDemo::class.java) {
                    if (field == null) {
                        field = SingletonDemo()
                    }
                }
            }
            return field
        }
        private set
}

////DCL模式
//class SingletonDemo private constructor() {
//    companion object {
//        val instance: SingletonDemo by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
//            SingletonDemo() }
//    }
//}

class myTest(var nums: Int) {
    var a: Int? = null

}


