package com.example.mvvm.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
//Room ko batata hai ke ye interface database operations perform karega

interface ContactDAO {
    @Insert
    suspend fun insertContact(contact: Contact)
    @Update
    suspend fun Update(contact: Contact)
    @Delete
    suspend fun DeleteContact(contact: Contact)

    @Query("Select * From contact ")
    fun getContact():LiveData<List<Contact>>
}