package com.example.multimodularcleanarchitecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.multimodularcleanarchitecture.ui.theme.MultimodularCleanArchitecture
import com.example.search.SearchBox

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MultimodularCleanArchitecture {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Greeting(
                            modifier = Modifier
                                .padding(innerPadding)
                        )
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier) {
    SearchBox()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MultimodularCleanArchitecture {
//        Greeting("Android")
    }
}