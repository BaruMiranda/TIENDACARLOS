package com.vesprotechnology.vesprodemo.Retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstanceMap {
    companion object Servicio{
        fun getRetroInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("http://localhost/microservicios/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}


