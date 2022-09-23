package com.example.movies.analytics

import android.content.Context
import com.example.core.analytics.AnalyticsSender
import com.example.core.analytics.Trackable
import com.example.movies.ui.MovieTracker
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class MoviesAnalyticsSender @Inject constructor(
  @ApplicationContext private val applicationContext: Context) : AnalyticsSender<MovieTracker> {
  private var trackers = listOf<MovieTracker>()


  override fun registerTrackers(trackers: List<MovieTracker>) {
    this.trackers = trackers
  }

  override fun track(event: Trackable<MovieTracker>) {
    trackers.forEach { tracker -> event.track(tracker, applicationContext) }
  }
}
