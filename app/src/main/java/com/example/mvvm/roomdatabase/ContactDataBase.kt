package com.example.mvvm.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase


//Ye code Room database ka foundation hai.

@Database (entities = [Contact::class],version=2)
abstract class ContactDataBase:RoomDatabase() {

    abstract fun contactDao():ContactDAO

    companion object{


        val migration_1_2= object : Migration(1, 2) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL("ALTER TABLE contact ADD COLUMN isActive INTEGER NOT NULL DEFAULT(1)")
                                    }

        }
        @Volatile
        //this volatile annotation is used when the Instance will get assigned some value all the threads will know about that due to volatile
        private var Instance:ContactDataBase?=null
        fun  getDataBase(context: Context):ContactDataBase{ //getDataBase is a public funtion
            if (Instance==null){
                synchronized(this){//there is possible two threads will create this database instance so that why to prevent that we use synchronized
                    Instance = Room.databaseBuilder(context.applicationContext, ContactDataBase::class.java, "contactDB")
                        .addMigrations(migration_1_2)
                        .build()
                }
            }
            return Instance !!
        }
    }

}