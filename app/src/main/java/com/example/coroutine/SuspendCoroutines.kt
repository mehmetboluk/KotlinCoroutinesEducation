package com.example.coroutine

import kotlinx.coroutines.*

fun main() {

    runBlocking {
        launch {
            delay(2000)
            println("run blocking...")
            myFunction()
        }
    }
}

//suspend fonk içerisinde coroutines calistirilabilen fonksiyonlardır.

suspend fun myFunction(){  // suspend fonksiyonlar ya suspend fonksiyonlar tarafından yada Coroutines içerisinden cagrilabilir.
    coroutineScope {
        delay(5000)
        println("suspend function")
    }
}