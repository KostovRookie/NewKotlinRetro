package com.example.newkotlinretro.retrofit

import com.example.newkotlinretro.model.ListUsers
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("search/users?q=Q")
    fun getServices() : Call<ListUsers>

}