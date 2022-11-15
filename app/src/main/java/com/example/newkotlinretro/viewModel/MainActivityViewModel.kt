package com.example.newkotlinretro.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newkotlinretro.model.ListUsers
import com.example.newkotlinretro.repo.MainActivityRepository

class MainActivityViewModel : ViewModel() {
    private var servicesLiveData: MutableLiveData<ListUsers>? = null

    fun getUser() : LiveData<ListUsers>? {
        servicesLiveData = MainActivityRepository.getServicesApiCall()
        return servicesLiveData
    }
}