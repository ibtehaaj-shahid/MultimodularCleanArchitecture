package com.example.search

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun DataBox(outObject: GetDataUseCase.Out) {
    Column {
        Text(text = outObject.data)
    }
}