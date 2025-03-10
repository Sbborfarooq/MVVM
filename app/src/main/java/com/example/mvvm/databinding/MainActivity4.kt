package com.example.mvvm.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.R

class MainActivity4 : AppCompatActivity() {
    lateinit var binding:ActivityMain4Binding
    lateinit var myViewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main4)

        myViewModel=ViewModelProvider(this).get(MyViewModel::class.java)

        binding.lifecycleOwner=this
        binding.myViewModel=myViewModel

    }
}