package ru.renett.helloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

private val LOG_TAG = MainActivity::class.simpleName

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(LOG_TAG, "Hello World")
    }
}
