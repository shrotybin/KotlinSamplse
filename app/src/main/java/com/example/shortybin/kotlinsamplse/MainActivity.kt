package com.example.shortybin.kotlinsamplse

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

        val array = Array(10) { 1 }

        array.map { println(it) }

        sum(10) { a, b -> a > b }

        val view: View? = View(this)

        view?.setOnClickListener { finish() }

    }

    fun sum(a: Int, b: (Int, Int) -> Boolean) {

        b(2, 3)
    }

    fun Activity.showToast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

}
