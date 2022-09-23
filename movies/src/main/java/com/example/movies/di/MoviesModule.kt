package com.example.movies.di

import android.content.Context
import com.example.movies.analytics.MoviesAnalyticsSender
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.*
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
object MoviesModule {

  @Provides
  fun provideMoviesAnalyticSender(@ApplicationContext context: Context): MoviesAnalyticsSender {
    return MoviesAnalyticsSender(context)
  }
}
