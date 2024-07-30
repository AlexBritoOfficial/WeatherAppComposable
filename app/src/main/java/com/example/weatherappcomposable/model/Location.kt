package com.example.weatherappcomposable.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.sql.Timestamp
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date


@Parcelize
class Location(val name: String, val region: String, val country: String, val localtime: String) :
    Parcelable {


        fun convertTimeStamp(): String{
            val timeStamp = Date(localtime)
           return  timeStamp.time.toString()
        }
}
