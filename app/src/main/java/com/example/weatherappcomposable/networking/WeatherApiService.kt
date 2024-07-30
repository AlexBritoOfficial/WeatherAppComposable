package com.example.weatherappcomposable.networking

import com.example.weatherappcomposable.model.CurrentWeather
import com.google.gson.JsonObject
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


private val BASE_URL = "https://api.weatherapi.com/v1/"

private val retrofit = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(BASE_URL).build()

val weatherService = retrofit.create(WeatherApiService::class.java)

interface WeatherApiService {
    @GET("current.json?q=Boston&key=de16327606224cf1be615425243007")
    suspend fun getCurrentForecast(): CurrentWeather
}