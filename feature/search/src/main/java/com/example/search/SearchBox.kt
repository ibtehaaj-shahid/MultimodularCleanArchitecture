package com.example.search

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import org.koin.java.KoinJavaComponent.inject

@Composable
fun SearchBox(value: String) {
    val searchUseCase by inject<SearchUseCase>(SearchUseCase::class.java)
    TextField(searchUseCase.execute(), onValueChange = {

    })
}