package com.example.mylibrarya

class ThisIsA {

    fun isA(): Boolean {
        return true
    }

    fun name(): String {
        return ThisIsA::class.java.simpleName + "hehehe"
    }
}