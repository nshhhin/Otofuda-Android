package com.example.otofuda_android.Response

import java.io.Serializable

data class Music (
    val title: String,
    val artist: String,
    val artwork_url: String,
    val genere: String,
    val id: Int,
    val preview_url: String,
    val release_date: String,
    val store_url: String
): Serializable