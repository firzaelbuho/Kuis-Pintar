package com.proximastudio.kuispintar.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DataRepository {

    fun create(): ApiServices {
        val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://firzaelbuho.github.io/")
                .build()
        return retrofit.create(ApiServices::class.java)
    }

}