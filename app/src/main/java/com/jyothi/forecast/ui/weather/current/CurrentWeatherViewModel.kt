package com.jyothi.forecast.ui.weather.current

import androidx.lifecycle.ViewModel
import com.jyothi.forecast.data.provider.UnitProvider
import com.jyothi.forecast.data.repository.ForecastRepository
import com.jyothi.forecast.internal.UnitSystem
import com.jyothi.forecast.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {
    private val unitSystem = unitProvider.getUnitSystem()

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather()
    }

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}
