package com.example.search

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.koin.java.KoinJavaComponent.inject

@Composable
fun SearchBox() {
    val searchUseCase by inject<SearchUseCase>(SearchUseCase::class.java)
    var text by remember { mutableStateOf("") }
    TextField(text, onValueChange = {
        text = it
    }, placeholder = {
        Text(text = searchUseCase.execute())
    })
}