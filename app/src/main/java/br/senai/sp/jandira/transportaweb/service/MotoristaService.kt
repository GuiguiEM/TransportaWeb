package br.senai.sp.jandira.transportaweb.service

import android.telecom.Call
import br.senai.sp.jandira.transportaweb.model.Motorista
import br.senai.sp.jandira.transportaweb.model.Results
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface MotoristaService {

    @GET("motorista/{id}")
    fun getMotoristaById(@Path("id") id: Int): retrofit2.Call<Motorista>

    @GET("motorista")
    fun getAllMotoristas(): retrofit2.Call<Results>

}