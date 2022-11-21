package com.example.newkotlinretro

import kotlinx.serialization.json.Json

val jsonDefaultInstance = Json { ignoreUnknownKeys = true; isLenient = true; encodeDefaults = false }