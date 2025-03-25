package com.example.mvvm.mvvmExample

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized


@Database(entities = [Quote::class],version=1)
abstract class QuoteDataBase:RoomDatabase() {

    abstract fun quoteDao(): QuoteDao

    private var Instance: QuoteDataBase? = null
    @OptIn(InternalCoroutinesApi::class)
    fun getDataBase(context: Context): QuoteDataBase {
        if (Instance == null) {
            synchronized(this) {
                Instance = Room.databaseBuilder(context, QuoteDataBase::class.java, "quote_database")
                    .createFromAsset("quotes.db")
                    .build()
            }
        }
        return Instance!!
    }
}

