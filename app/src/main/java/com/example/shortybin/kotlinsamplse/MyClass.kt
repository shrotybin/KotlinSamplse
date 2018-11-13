package com.example.shortybin.kotlinsamplse

import android.util.Log

//在本包内都可以调该函数
fun a(){

}

class MyClass constructor(name: String) {
    var mName = ""

    init {
        mName = name
    }

    fun getString(): String = mName

}