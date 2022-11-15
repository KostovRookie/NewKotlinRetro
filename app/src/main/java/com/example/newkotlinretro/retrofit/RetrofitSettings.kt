package com.example.newkotlinretro.retrofit

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

object RetrofitSettings {
    private val contentType = "application/json".toMediaType()



    fun getInstance(): ApiInterface {
        val mHttpLoggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

        val mOkHttpClient = OkHttpClient
            .Builder()
            .addInterceptor(mHttpLoggingInterceptor)
            .build()


        return Retrofit.Builder()
            .baseUrl("https://api.github.com")

            .addConverterFactory(
                Json.asConverterFactory(contentType))    // Strict always false and still "Unexpected JSON token"

            .client(mOkHttpClient)

            .build()
            .create(ApiInterface:: class.java)



    }
}