package com.example.koin_exemple.data.repository

import com.example.koin_exemple.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}