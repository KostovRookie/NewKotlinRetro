package com.example.newkotlinretro.retrofit

import kotlinx.serialization.json.Json

val jsonDefaultInstance = Json { ignoreUnknownKeys = true; isLenient = true; encodeDefaults = false }