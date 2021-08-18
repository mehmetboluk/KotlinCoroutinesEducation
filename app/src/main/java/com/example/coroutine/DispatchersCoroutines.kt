package com.example.coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    //Dispatchers
    //Dispatchers.Default -> CPU Intensive, İşlemciyi çok kullanacak işlemlerde kullanılır.
    //Dispatchers.IO -> Input / Output  Networking işlemleri. İnternete girip veri çekmek. Veritabanından veri almak gibi.
    //Dispatchers.Main - > UI işlemleri. Kullancının göreceği işlemleri burada yapmak gerekir.
    //Dispatchers..Unconfined -> Inherited dispatchers

    runBlocking {
        launch(Dispatchers.Main) {
            println("Main Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Unconfined) {
            println("Unconfined Thread: ${Thread.currentThread().name}")
        }
    }
}