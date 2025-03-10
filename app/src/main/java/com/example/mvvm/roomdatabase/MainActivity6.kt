package com.example.mvvm.roomdatabase

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.mvvm.R
import com.example.mvvm.databinding.ActivityMain6Binding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity6 : AppCompatActivity() {
    lateinit var binding: ActivityMain6Binding
    lateinit var dataBase: ContactDataBase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //this only for testing purpose to insert data into our database best practice is to use Singlton object
        dataBase =
            Room.databaseBuilder(applicationContext, ContactDataBase::class.java, "contactDB")
                .build()
        GlobalScope.launch {
            dataBase.contactDao().insertContact(Contact(0, "sabbor", "030303030"))
        }
    }

    fun getData(view: View) {dataBase.contactDao().getContact().observe(
        this, { Log.d("cheez", it.toString()) }
    ) }


}

