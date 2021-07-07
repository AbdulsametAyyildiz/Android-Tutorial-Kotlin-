package com.kalemlisipahi.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        define()
    }

    private fun define()
    {
        val list = listOf("ay","gün","yıl")

        val arrayList = arrayListOf("bir","iki","üç","bir","iki","üç")
        arrayList.clear()
        arrayList.addAll(list)
        printList(arrayList.toTypedArray())

        printList(list.toTypedArray())
    }

    private fun printList(listStr: Array<String>)
    {
        for(i in listStr.toList())
        {
            println(i)
        }
    }
}

