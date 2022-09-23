package com.example.movies.analytics

import android.content.Context
import com.example.core.analytics.Trackable
import com.example.movies.ui.MovieTracker

sealed class MovieTrackingEvent: Trackable<MovieTracker> {

  class TrackMovieLiked(
    private val movieTitle: String,
    private val movieId: String): MovieTrackingEvent() {

    override fun track(tracker: MovieTracker, context: Context) {
      tracker.trackMovieLike(context, movieTitle, movieId)
    }
    }
}
