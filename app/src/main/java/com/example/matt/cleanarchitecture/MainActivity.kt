package com.example.matt.cleanarchitecture

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import com.example.matt.cleanarchitecture.data.SimpleClass
import com.example.matt.cleanarchitecture.domain.MyClass
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var context: Context

    @Inject
    lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val man = SimpleClass()
        val mclas = MyClass()

        Log.v("Test", context.toString() + " " + prefs.toString())
    }
}
