package com.gogote.shayari

class AppRepository private constructor(){

    val list=SampleData.data

    companion object {
        val instance = AppRepository()
    }
}