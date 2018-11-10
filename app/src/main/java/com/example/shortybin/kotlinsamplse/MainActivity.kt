package com.example.shortybin.kotlinsamplse

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myClass = MyClass("123")

        showToast(myClass.mName)
        myClass.mName = "456"
        showToast(myClass.getString())


        InstanceClass.name
        InstanceClass.getString()
    }

    fun Activity.showToast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

}
