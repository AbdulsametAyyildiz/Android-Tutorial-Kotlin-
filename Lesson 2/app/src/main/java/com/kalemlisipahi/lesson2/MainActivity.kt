package com.kalemlisipahi.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        define()
    }

    private fun define()
    {
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        val list = listOf("ay","gün","yıl")

        val arrayList = arrayListOf("bir","iki","üç","bir","iki")
        //arrayList.clear() array list'i sıfırlamak kullanırız
        //arrayList.addAll(list) array list'e toplu şekilde liste eklemek için
        printList(arrayList.toTypedArray())

        //printList(list.toTypedArray())
    }

    private fun printList(listStr: Array<String>)
    {
        for(i in listStr.toList())
        {
            println(i)
        }

        control(listStr[0])
    }

    private fun control(str: String)
    {
        if(str == "bir") Toast.makeText(applicationContext,"Bir sayısı geldi",Toast.LENGTH_SHORT).show()
        else Toast.makeText(applicationContext,"Sayı bir değil",Toast.LENGTH_SHORT).show()

        button.setOnClickListener {
            when(str)
            {
                "bir" -> textView.text = "bir"

                "üç" -> Toast.makeText(applicationContext,"Üç sayısı geldi",Toast.LENGTH_SHORT).show()

                else -> Toast.makeText(applicationContext,"belirlenen değer gelmedi",Toast.LENGTH_SHORT).show()
            }
        }

    }

    /*public fun buttonClicked(view: View)
    {

    }*/
}

