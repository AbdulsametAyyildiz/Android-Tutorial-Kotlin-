package com.kalemlisipahi.lesson3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var counterText: TextView
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        define()
    }

    private fun define()
    {
        counterText = findViewById(R.id.counterText)
    }

    fun counterBtn(view: View)
    {
        counter++
        counterText.text = counter.toString()
    }

    fun resetBtn(view: View)
    {
        counter = 0
        counterText.text = counter.toString()
    }

}