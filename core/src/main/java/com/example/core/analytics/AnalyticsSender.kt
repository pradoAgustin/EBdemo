package com.example.core.analytics

import android.content.Context

interface AnalyticsSender<T : Tracker> {

  fun registerTrackers(trackers: List<T>) {}

  fun track(event: Trackable<T>)
}
