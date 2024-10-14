package com.example.di.usecase

import com.example.search.SearchRepository
import com.example.search.SearchRepositoryImpl
import com.example.search.SearchUseCase
import org.koin.dsl.module

val appModule = module {
    single<SearchRepository> { SearchRepositoryImpl() }
    single { SearchUseCase(get()) }
}