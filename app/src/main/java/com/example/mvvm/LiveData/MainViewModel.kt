package com.example.mvvm.LiveData

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val factsLiveData =MutableLiveData<String>("this is fact")

    fun udpateLiveData(){
        factsLiveData.value="Another fact"
    }
}