package com.example.mvvm.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


//Ye code Room database ka foundation hai.

@Database (entities = [Contact::class],version=1)
abstract class ContactDataBase:RoomDatabase() {

    abstract fun contactDao():ContactDAO

    companion object{
        @Volatile
        //this volatile annotation is used when the Instance will get assigned some value all the threads will know about that due to volatile
        private var Instance:ContactDataBase?=null
        fun  getDataBase(context: Context):ContactDataBase{ //getDataBase is a public funtion
            if (Instance==null){
                synchronized(this){//there is possible two threads will create this database instance so that why to prevent that we use synchronized
                    Instance = Room.databaseBuilder(context.applicationContext, ContactDataBase::class.java, "contactDB").build()
                }
            }
            return Instance !!
        }
    }

}