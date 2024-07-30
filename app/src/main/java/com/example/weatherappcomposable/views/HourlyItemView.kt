package com.example.weatherappcomposable.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weatherappcomposable.R

@Composable
fun HourlyItemView() {

    Column(
        modifier = Modifier.wrapContentSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        // Current Time
        Text(text = "12PM")

        // Weather Icon
        Image(painter = painterResource(id = R.drawable.baseline_sunny_24), contentDescription = "")

        // Current Temp
        Text(text = "85\u2109")

    }
}

@Preview(showBackground = true)
@Composable
fun HourlyItemViewPreview() {
    HourlyItemView()
}