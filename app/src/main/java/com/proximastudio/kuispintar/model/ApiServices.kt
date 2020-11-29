package com.proximastudio.kuispintar.model

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

    @GET("api/soal.json")

    fun getQuestion(): retrofit2.Call<List<QuestionSet>>



}