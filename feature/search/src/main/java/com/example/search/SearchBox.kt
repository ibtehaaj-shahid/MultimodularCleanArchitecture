package com.example.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.koin.java.KoinJavaComponent.inject

@Composable
fun SearchBox() {
    val searchUseCase by inject<SearchUseCase>(SearchUseCase::class.java)
    val getDataUseCase by inject<GetDataUseCase>(GetDataUseCase::class.java)

    var text by remember { mutableStateOf("") }
    Column {
        TextField(text, onValueChange = {
            text = it
        }, placeholder = {
            Text(text = searchUseCase.execute())
        })
        Spacer(Modifier.height(20.dp))
        DataBox(outObject = getDataUseCase.invoke())
    }

}