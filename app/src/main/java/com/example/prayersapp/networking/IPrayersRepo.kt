package com.example.prayersapp.networking

import com.example.prayersapp.prayers.PrayerResponse
import retrofit2.Response

interface IPrayersRepo {

    suspend fun getPrayers(
        date: String,
        city: String,
        countryCode: String,
        method: Int
    ): Response<PrayerResponse>
}