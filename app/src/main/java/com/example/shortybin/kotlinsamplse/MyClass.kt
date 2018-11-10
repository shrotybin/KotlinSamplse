package com.example.shortybin.kotlinsamplse

class MyClass constructor(name: String) : OpenClass(name) {
    var mName = ""

    init {
        mName = name
    }

    fun getString(): String = mName
}