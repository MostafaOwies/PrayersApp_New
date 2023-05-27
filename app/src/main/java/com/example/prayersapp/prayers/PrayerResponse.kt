package com.example.prayersapp.prayers

import com.example.prayersapp.prayers.Data

data class PrayerResponse(
    val code: Int,
    val data: Data,
    val status: String
)