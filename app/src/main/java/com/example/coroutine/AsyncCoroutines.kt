package com.example.coroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    var username = ""
    var userage = 0
    /*
    runBlocking {
        launch { // bu şekilde threadin inmesini beklemez beklemesi için asyncron olması lazım
            val downloadedName = downloadName()
            username = downloadedName
        }
        launch {
            val downloadeAge = downloadAge()
            userage = downloadeAge
        }
        println("Username: ${userage}, Age: ${userage}")

         */

    runBlocking {

        val downloadedName = async {
            downloadName()
        }
        val downloadedAge = async {
            downloadAge()
        }

        username = downloadedName.await()
        userage = downloadedAge.await()

        println("$username, $userage")


    }

    }



suspend fun downloadName() : String {
    delay(2000)
    val username = "Mehmet"
    println("username downloadName")
    return username
}

suspend fun downloadAge() : Int {
    delay(4000)
    val age = 26
    println("username downloadAge")
    return age
}