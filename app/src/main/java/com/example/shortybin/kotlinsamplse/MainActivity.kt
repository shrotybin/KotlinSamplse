package com.example.shortybin.kotlinsamplse

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Activity.showToast(msg:String)=Toast.makeText(this,msg,Toast.LENGTH_LONG).show()

}
