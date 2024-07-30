package com.example.weatherappcomposable

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.weatherappcomposable.ui.theme.WeatherAppComposableTheme
import com.example.weatherappcomposable.views.WeatherApp

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                val innerPadding = innerPadding
                WeatherAppComposableTheme {
                    WeatherApp()
                }
            }
        }
    }
}

