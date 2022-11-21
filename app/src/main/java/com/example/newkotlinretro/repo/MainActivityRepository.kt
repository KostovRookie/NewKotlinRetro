package com.example.newkotlinretro.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.newkotlinretro.model.ListUsers
import com.example.newkotlinretro.retrofit.RetrofitSettings
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object MainActivityRepository {


    private val serviceSetterGetter = MutableLiveData<ListUsers>()

    fun getServicesApiCall(): MutableLiveData<ListUsers> {

        val call = RetrofitSettings.getInstance().getServices()

        call.enqueue(object: Callback<ListUsers> {
            override fun onFailure(call: Call<ListUsers>, t: Throwable) {
                Log.e("TAG  : fail", t.message.toString())
            }

            override fun onResponse(
                call: Call<ListUsers>,
                response: Response<ListUsers>
            ) {
                Log.d("Tag : work", response.body().toString())

                val data = response.body()

              //  val msg = data!!

              //  serviceSetterGetter.value = ListUsers(msg)
            }
        })

        return serviceSetterGetter
    }
}