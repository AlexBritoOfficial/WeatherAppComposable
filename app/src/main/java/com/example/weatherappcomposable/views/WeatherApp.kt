package com.example.weatherappcomposable.views

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.weatherappcomposable.viewmodel.WeatherViewModel

@Composable
fun WeatherApp() {

    val weatherViewModel: WeatherViewModel = viewModel()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        Spacer(modifier = Modifier.padding(20.dp))
        CurrentForecast(weatherViewModel)
        HourlyForecast()

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWeatherApp() {
//    WeatherApp()
}