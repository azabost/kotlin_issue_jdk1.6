package com.example.app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.my_activity.*

class MyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_activity)

        val myMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
        val element = myMap.getOrDefault(1, "x") // will crash here if you use API 19 emulator

        println(element) // will print "a" if you use API 25 emulator
        textView.text = element
    }
}