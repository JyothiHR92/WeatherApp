package com.jyothi.forecast.data.network.response

import com.google.gson.annotations.SerializedName
import com.jyothi.forecast.data.db.entity.CurrentWeatherEntry
import com.jyothi.forecast.data.db.entity.WeatherLocation
import com.jyothi.forecast.data.db.entity.Request

data class CurrentWeatherResponse(
    val request: Request,
    val location: WeatherLocation,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)