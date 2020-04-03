package com.jyothi.forecast.data.provider

import com.jyothi.forecast.internal.UnitSystem

interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}