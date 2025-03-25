package com.example.mvvm.mvvmExample

import androidx.lifecycle.LiveData

class QuoteRepository(val quoteDao: QuoteDao) {

    fun getQuote(): LiveData<List<Quote>>{
        return quoteDao.getQuote()
    }

    suspend fun insertQuote(quote: Quote){
        quoteDao.insertQuote(quote)
    }


}