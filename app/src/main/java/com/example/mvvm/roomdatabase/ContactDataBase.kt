package com.example.mvvm.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase


//Ye code Room database ka foundation hai.

@Database (entities = [Contact::class],version=1)
abstract class ContactDataBase:RoomDatabase() {

    abstract fun contactDao():ContactDAO

}