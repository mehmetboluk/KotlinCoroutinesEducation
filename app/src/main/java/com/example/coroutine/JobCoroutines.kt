package com.example.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    //Job


    runBlocking {

        val job = launch {
            delay(2000)
            println("job")
            val secondJob = launch {
                delay(2000)
                println("job2")
            }
        }

        job.invokeOnCompletion {
            println("job is ended.")
        }

        job.cancel()  //job u iptal edilirse  direk sondaki işi yapılır.
    }
}