package com.example.myretrofitexample

import retrofit2.http.GET
import com.example.myretrofitexample.model.Feed
import retrofit2.Call

interface FeedAPI {
    @get:GET("earthporn/.rss")
    val feed: Call<Feed?>?

    companion object {
        const val BASE_URL = "https://www.reddit.com/r/"
    }
}