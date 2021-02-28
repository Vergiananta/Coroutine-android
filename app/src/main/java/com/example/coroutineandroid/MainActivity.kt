package com.example.coroutineandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    val maxProgress = 100
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progressBar.max = maxProgress

    }

    fun startProgress(v : View?) {
        CoroutineScope(Dispatchers.IO).launch {
            if (v == pencet){
                for ( i in 1..100){
                    Thread.sleep(1000)
                    Log.i("PROGRESS BAR", i.toString())
                    progressBar.setProgress(i)

                }
            }
        }
    }


}