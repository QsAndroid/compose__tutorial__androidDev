package com.example.lib.repo

import com.example.lib.domain.QuoteList
import retrofit2.Response
import retrofit2.http.GET


interface QuoteApi {

    @GET("/quotes")
    suspend fun getQuotes () : Response <QuoteList>
}