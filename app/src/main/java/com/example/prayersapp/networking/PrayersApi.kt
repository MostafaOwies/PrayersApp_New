package com.example.prayersapp.networking

import com.example.prayersapp.prayers.PrayerResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PrayersApi {

    @GET("v1/timingsByCity/{date}")
    suspend fun getTimings(
        @Path("date") date: String,
        @Query("city") city: String,
        @Query("country") country: String,
        @Query("method") method: Int

        ): Response<PrayerResponse>
}