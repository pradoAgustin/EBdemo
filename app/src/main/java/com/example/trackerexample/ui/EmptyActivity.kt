package com.example.trackerexample.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.movies.ui.MoviesActivity
import com.example.trackerexample.R

class EmptyActivity : AppCompatActivity()  {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_empty)

    val intent = Intent(this, MoviesActivity::class.java)
    Log.d("EXAMPLE", " starting movies module activity")
    startActivity(intent)
  }
}
