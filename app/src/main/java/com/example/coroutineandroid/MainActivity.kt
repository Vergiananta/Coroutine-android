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

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val maxProgress = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progressBar.max = maxProgress
        pencet.setOnClickListener(this)
    }

    private fun startProgress() {
        val progressThread = ProgressBar(this)
        progressThread.execute()
    }

    override fun onClick(v: View?) {
        when(v){
            pencet -> startProgress()
        }
    }

    fun notifyProgressBar(progress: Int){
        progressBar.setProgress(progress)
    }

}