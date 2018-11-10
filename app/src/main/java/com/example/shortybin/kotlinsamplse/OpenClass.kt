package com.example.shortybin.kotlinsamplse

/**
 * 超类
 */
open class OpenClass constructor(name:String){
    val age: Int = 0

    open fun getAge(){}
}