package com.example.coroutineandroid

import android.os.AsyncTask
import android.util.Log

class ProgressBar(var mainActivity: MainActivity) : AsyncTask<Unit, Unit, Unit>() {
    override fun doInBackground(vararg params: Unit?) {
        for (i in 1..100){
            Log.i("Loop", i.toString())
            mainActivity.notifyProgressBar(i)
            Thread.sleep(50)
        }
    }
}