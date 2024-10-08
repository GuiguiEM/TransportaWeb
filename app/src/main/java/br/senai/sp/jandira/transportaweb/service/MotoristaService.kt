package br.senai.sp.jandira.transportaweb.service

import br.senai.sp.jandira.transportaweb.model.LoginMotorista
import br.senai.sp.jandira.transportaweb.model.Motorista
import br.senai.sp.jandira.transportaweb.model.RespostaLogin
import br.senai.sp.jandira.transportaweb.model.Results
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface MotoristaService {

    @GET("motorista/{id}")
    fun getMotoristaById(@Path("id") id: Int): Call<Motorista>

    @GET("motorista")
    fun getAllMotoristas(): Call<Results>

    @Headers("Content-Type: application/json")
    @POST("/v1/transportaweb/motorista/login")
    fun getMotoristaByEmailSenha(@Body EmailSenha: LoginMotorista): Call<RespostaLogin>

}