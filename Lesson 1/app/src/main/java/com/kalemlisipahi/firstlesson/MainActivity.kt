package com.kalemlisipahi.firstlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("this is onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("this is onStart")
    }

    override fun onResume() {
        super.onResume()
        println("this is onResume")
    }

    override fun onPause() {
        super.onPause()
        println("this is onPause")
    }

    override fun onStop() {
        super.onStop()
        println("this is onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("this is onDestroy")
    }
}