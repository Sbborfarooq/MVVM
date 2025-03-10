package com.example.mvvm.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
    val poetryLiveData=MutableLiveData("this is old data  ")

    fun updatePoetry(){
        poetryLiveData.value="this is new data"
    }
}