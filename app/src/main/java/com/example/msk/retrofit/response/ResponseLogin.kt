package com.example.msk.retrofit.response

data class ResponseLogin(
    var respuesta:Boolean,
    var idestiba:Int,
    var documento:Boolean,
    var nrodocumento:String,
    var contrasenia:String,
    var nombre:String,
    var apellido:String,
    var edad:Int,
    var telefono:String,
    var mensaje:String
)
