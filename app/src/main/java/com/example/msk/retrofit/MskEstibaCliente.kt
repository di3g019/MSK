package com.example.msk.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MskEstibaCliente {

    private fun buildRetrofit() = Retrofit.Builder()
        .baseUrl("")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val retrofitService:MskEstibaServicio by lazy {
        buildRetrofit().create(MskEstibaServicio::class.java)
    }
}