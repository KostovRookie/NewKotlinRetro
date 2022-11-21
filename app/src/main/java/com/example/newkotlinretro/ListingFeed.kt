package com.example.newkotlinretro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newkotlinretro.ui.main.ListingFeedFragment

class ListingFeed : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listing_feed)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ListingFeedFragment.newInstance())
                .commitNow()
        }
    }
}