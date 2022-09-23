package com.example.movies.analytics.google

import android.content.Context
import android.util.Log
import com.example.core.analytics.google.GoogleAnalyticsParametersBuilder
import com.example.movies.analytics.MOVIE_ID
import com.example.movies.analytics.MOVIE_TITLE
import com.example.movies.analytics.TRACK_MOVIE_LIKE
import com.example.movies.ui.MovieTracker
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase

class GoogleMoviesAnalyticsTracker : MovieTracker {

  override fun trackMovieLike(contex: Context, movieTitle: String, movieId: String) {
    /** these should be the call if you are using firebase analytics
     **/
   /* val bundle = GoogleAnalyticsParametersBuilder()
      .addStringParam(MOVIE_TITLE, movieTitle)
      .addStringParam(MOVIE_ID, movieId)
      .buildBundle()

    Firebase.analytics.logEvent(TRACK_MOVIE_LIKE, bundle)
   */
    Log.d("EXAMPLE", " track movie list has been sent: $movieTitle, $movieId");
  }
}
