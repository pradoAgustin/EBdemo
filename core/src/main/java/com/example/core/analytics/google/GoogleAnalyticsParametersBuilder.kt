package com.example.core.analytics.google

import java.util.*
import com.google.firebase.analytics.ktx.ParametersBuilder
class GoogleAnalyticsParametersBuilder {

  private val parametersBuilder by lazy { ParametersBuilder() }

  fun addStringParam(key: String, value: String) : GoogleAnalyticsParametersBuilder {
    parametersBuilder.param(key, value.lowercase(Locale.ROOT))
    return this
  }

  fun addLongParam(key: String, value: Long) : GoogleAnalyticsParametersBuilder {
    parametersBuilder.param(key, value)
    return this
  }

  fun addDoubleParam(key: String, value: Double) : GoogleAnalyticsParametersBuilder {
    parametersBuilder.param(key, value)
    return this
  }

  fun buildBundle() = parametersBuilder.bundle
}
