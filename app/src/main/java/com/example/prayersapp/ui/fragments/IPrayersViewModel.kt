package com.example.prayersapp.ui.fragments

interface IPrayersViewModel {
    suspend fun getPrayers(date: String, city: String, countryCode: String, method: Int)
}