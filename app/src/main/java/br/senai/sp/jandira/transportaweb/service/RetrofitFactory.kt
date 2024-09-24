package br.senai.sp.jandira.transportaweb.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val BASE_URL = "mysql://web:transporta123!@transporta.mysql.database.azure.com:3306/db_transporta_web"

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getMotoristaService(): MotoristaService {
        return retrofitFactory.create(MotoristaService::class.java)
    }
}