package com.example.msk.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.msk.repository.AuthRepository
import com.example.msk.retrofit.request.RequestLogin
import com.example.msk.retrofit.response.ResponseLogin

class AuthViewModel : ViewModel() {

    var responseLogin: LiveData<ResponseLogin>
    private var authRepository = AuthRepository()

    init {
        responseLogin = authRepository.loginResponse
    }

    fun autenticarUsuario(documento:Boolean, nrodocumento:String, contrasenia:String){
        responseLogin = authRepository.autenticarUsuario(RequestLogin(documento,nrodocumento,contrasenia))
    }

}