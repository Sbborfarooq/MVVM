package com.example.mvvm.LiveData

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.R
import com.example.mvvm.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding:ActivityMain3Binding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel= ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.factsLiveData.observe(this, Observer{
            //update logic here in observer
            binding.textView.text=it//it represent implicit current value
//            it Kotlin mein lambda function ke liye ek implicit (automatic) parameter hai
//            Ye code ko short aur readable banane ke liye use hota hai
//            Ye basically ek variable hi hai jo automatically define ho jata hai
//            Agar explicit variable name chahiye to:

        })

        binding.button.setOnClickListener{ 
            mainViewModel.udpateLiveData()
        }

    }
}