package com.example.core.analytics

interface Tracker {
  val anonymousTracker: Boolean
    get() = true
}
