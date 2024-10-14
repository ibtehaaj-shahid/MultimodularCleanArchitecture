package com.example.olxarchitecturedemov2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.olxarchitecturedemov2.ui.theme.OLXArchitectureDemoV2Theme
import com.example.search.SearchBox
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OLXArchitectureDemoV2Theme {
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
    OLXArchitectureDemoV2Theme {
//        Greeting("Android")
    }
}