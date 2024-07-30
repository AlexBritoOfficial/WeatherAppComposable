package com.example.weatherappcomposable.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HourlyForecast(modifier: Modifier = Modifier.padding(10.dp)){

    LazyRow(modifier = Modifier.wrapContentSize().padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(25.dp)) {
        items(10){
            HourlyItemView()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HourlyForecastPreview() {
    HourlyForecast()
}