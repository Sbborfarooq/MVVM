package com.example.mvvm.roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

//this will be the table in our database
//Room internally SQLite database use karta hai, jo mobile devices ke liye optimize kiya gaya lightweight database hai
@Entity(tableName ="contact")
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id:Long,
    val name:String,
    val phone:String,
    val isActive:Int
)
