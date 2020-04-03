package com.jyothi.forecast.data.repository

import androidx.lifecycle.LiveData
import com.jyothi.forecast.data.db.entity.CurrentWeatherEntry
import com.jyothi.forecast.data.db.entity.WeatherLocation

interface ForecastRepository {
    suspend fun getCurrentWeather(): LiveData<CurrentWeatherEntry>
    suspend fun getWeatherLocation(): LiveData<WeatherLocation>
}