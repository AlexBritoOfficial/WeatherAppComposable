package com.example.weatherappcomposable.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Current(
    val temp_c: Double,
    val temp_f: Double,
    val is_day: Int,
):Parcelable
