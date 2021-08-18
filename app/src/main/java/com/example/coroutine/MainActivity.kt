package com.example.coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness
        /* Global Scope
        GlobalScope.launch {
            repeat(100_00){
                launch {
                    println("Android")
                }
            }
        }
        */

        /* runBlocking
        println("runBlocking start.")
        runBlocking {
            launch {
                delay(2000)
                println("run blocking.")
            }
        }
        println("nBlocking end.")
        */

        /*Global Scope
        println("Global scope start")
        GlobalScope.launch {
            delay(2000)
            println("Global Scope")
        }
        println("Global scope end")
        */

        /*CoroutineScope
        println("coroutines start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(2000)
            println("coroutines")
        }
        println("coroutines end")
        */




    }
}