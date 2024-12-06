package com.example.msk.retrofit

import com.example.msk.retrofit.request.RequestLogin
import com.example.msk.retrofit.response.ResponseLogin
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface MskEstibaServicio {
    //metodos http estiba
    @POST("login")
    fun login(@Body loginRequest: RequestLogin):
            Call<ResponseLogin>

}