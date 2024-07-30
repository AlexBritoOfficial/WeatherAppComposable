package com.example.weatherappcomposable.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Condition(
    val text: String,
    val last_updated: String,
    val icon: String,
):Parcelable
