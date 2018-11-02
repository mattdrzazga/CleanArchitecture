package com.example.matt.cleanarchitecture

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.matt.cleanarchitecture.data.SimpleClass
import com.example.matt.cleanarchitecture.domain.MyClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val man = SimpleClass()
        val mclas = MyClass()
    }
}
