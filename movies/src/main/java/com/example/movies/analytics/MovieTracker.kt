package com.example.movies.ui

import android.content.Context
import com.example.core.analytics.Tracker

interface MovieTracker: Tracker {
  fun trackMovieLike(context: Context,movieTitle: String, movieId: String) {}
  fun trackMovieRemovedFromUserList(movieTitle: String, movieId: String) {}
  fun trackUserMovieQualification(movieTitle: String, movieId: String, movieQualification: Int) {}
}
