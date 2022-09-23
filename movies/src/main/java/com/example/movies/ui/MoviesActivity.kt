package com.example.movies.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.movies.R
import com.example.movies.analytics.MovieTrackingEvent
import com.example.movies.analytics.MoviesAnalyticsSender
import com.example.movies.analytics.google.GoogleMoviesAnalyticsTracker
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class MoviesActivity : AppCompatActivity() {
  /**Good enhance por developers should be two use hilt as DI ,
   * for this example we are going to init the var instead of injecting it
   * you can check that everything is set up to inject with minor adjustments
   *
  @Inject
  lateinit var moviesAnalyticsSender: MoviesAnalyticsSender
  **/


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.movies_fragment)
    val analyticsSender = MoviesAnalyticsSender(this)
    val movieName = "The Lion King"
    val movieRandomId = UUID.randomUUID().toString()

    analyticsSender.apply {
      registerTrackers(listOf(GoogleMoviesAnalyticsTracker()))
      track(
        event = MovieTrackingEvent.TrackMovieLiked(
          movieTitle = movieName,
          movieId = movieRandomId
        )
      )
    }
  }
}
