package com.example.mvvm.lifeCycleAwareComponent

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner


class Observer : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        Log.d("Main", "Observer - onCreate")
    }

    override fun onStart(owner: LifecycleOwner) {
        Log.d("Main", "Observer - onStart")
    }

    override fun onResume(owner: LifecycleOwner) {
        Log.d("Main", "Observer - onResume")
    }

    override fun onPause(owner: LifecycleOwner) {
        Log.d("Main", "Observer - onPause")
    }

    override fun onStop(owner: LifecycleOwner) {
        Log.d("Main", "Observer - onStop")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.d("Main", "Observer - onDestroy")
    }
}