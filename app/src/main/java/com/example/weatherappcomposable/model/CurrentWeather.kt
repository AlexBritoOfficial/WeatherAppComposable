package com.example.weatherappcomposable.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CurrentWeather(
    val location: Location,
    val current: Current,
    val condition: Condition):Parcelable
