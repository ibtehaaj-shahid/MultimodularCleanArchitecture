package com.example.search

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DataBox(outObject: GetDataUseCase.Out) {
    Column {
        Text(text = outObject.data)
        Text(text = outObject.id)
        Text(text = outObject.name)
    }
}