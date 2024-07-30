package com.example.weatherappcomposable.views

import android.os.Build
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weatherappcomposable.R
import com.example.weatherappcomposable.model.CurrentWeather
import com.example.weatherappcomposable.viewmodel.WeatherViewModel

@Composable
fun CurrentForecast(weatherViewModel: WeatherViewModel) {
    Column(
        modifier = Modifier.wrapContentSize(),
        verticalArrangement = Arrangement.spacedBy(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // City Name
        Text(text = weatherViewModel.currentWeatherResponseState.value.location.name)

        // Current Time
        Text(text = weatherViewModel.currentWeatherResponseState.value.location.localtime)

        // Current Temp
        Text(text = "${weatherViewModel.currentWeatherResponseState.value.current.temp_f}\u2109")

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.baseline_sunny_24),
                contentDescription = ""
            )
            Text(text = "Sunny")
        }


    }
}

@Composable
@Preview(showBackground = true)
fun PreviewCurrentForecast() {
//    CurrentForecast()
}