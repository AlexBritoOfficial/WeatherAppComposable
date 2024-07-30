package com.example.weatherappcomposable.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherappcomposable.model.Condition
import com.example.weatherappcomposable.model.Current
import com.example.weatherappcomposable.model.CurrentWeather
import com.example.weatherappcomposable.model.Location
import com.example.weatherappcomposable.networking.weatherService
import com.example.weatherappcomposable.views.CurrentForecast
import kotlinx.coroutines.launch

class WeatherViewModel: ViewModel() {

    private val _currentWeatherResponseState = mutableStateOf(CurrentWeather(
        location = Location("","","",""),
        current = Current(0.0,0.0,0),
        condition = Condition("","","")
    ))
    val currentWeatherResponseState: State<CurrentWeather> = _currentWeatherResponseState

//    private val _currentWeatherResponseState = mutableStateOf("")
//    val currentWeatherResponseState: State<String> = _currentWeatherResponseState

    init {
        fetchCurrentWeatherReport()
    }

    private fun fetchCurrentWeatherReport() {
        viewModelScope.launch {
            try {
                val response = weatherService.getCurrentForecast()
                _currentWeatherResponseState.value = response
            } catch (e: Exception) {

            }
        }
    }

}