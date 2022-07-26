package 绝活

import java.io.IOException
import java.net.ServerSocket

class ServerListener : Thread() {
    override fun run() {
        try {
            val serverSocket = ServerSocket(23456)
            while (true) {
                val socket = serverSocket.accept()

            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}

fun main() {
    val serverSocket = ServerListener()
    serverSocket.start()
}