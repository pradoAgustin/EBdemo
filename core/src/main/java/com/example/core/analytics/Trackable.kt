package com.example.core.analytics

import android.content.Context

interface Trackable<T : Tracker> {
  fun track(tracker: T, context: Context)
}
