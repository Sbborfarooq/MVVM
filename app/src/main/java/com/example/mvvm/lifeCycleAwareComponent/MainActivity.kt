package com.example.mvvm.lifeCycleAwareComponent

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.DefaultLifecycleObserver
import com.example.mvvm.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


    lifecycle.addObserver(Observer())
    Log.d("Main", "Activity onCreate called")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Main", "Activity onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main", "Activity onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main", "Activity onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main", "Activity onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main", "Activity onDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Main", "Activity onRestart called")
    }
}