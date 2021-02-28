package com.example.coroutineandroid

import android.os.AsyncTask

class ProgressBar(var mainActivity: MainActivity) : AsyncTask<Unit, ProgressBar, Unit>() {
    override fun doInBackground(vararg params: Unit?) {
        for(i in 1..100){

        }
    }
}