package com.example.koin_exemple.di.module

import com.example.koin_exemple.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {

    single {
        MainRepository(get())
    }
}
