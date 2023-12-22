package com.example.mvvmexample.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmexample.Model.Repository

class NumberViewModel: ViewModel() {
    val repository: Repository by lazy {
        Repository()
    }

    val currentNumber: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun incrementText(){
        var number = repository.getNumber()
        number++
        currentNumber.value = number
        repository.updateNumber(currentNumber.value!!)
    }
}

