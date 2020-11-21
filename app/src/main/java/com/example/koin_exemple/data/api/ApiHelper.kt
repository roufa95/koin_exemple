package com.example.koin_exemple.data.api

import com.example.koin_exemple.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>
}