package com.example.mvvmexample.Model

class Repository {
    val datasource : Datasource by lazy {
        Datasource()
    }

    fun getNumber(): Int{
        return datasource.number
    }

    fun updateNumber(number: Int){
        datasource.number = number
    }
}