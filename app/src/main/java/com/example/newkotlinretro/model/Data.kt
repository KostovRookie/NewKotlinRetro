package com.example.newkotlinretro.model

import kotlinx.serialization.*

@Serializable
data class Data(
    @SerialName("login")
    var login: String,
    @SerialName("type")
    var type: String,
    @SerialName("avatar_url")
    var avatar: String,
    @SerialName("node_id")
    var id: Int,
    @SerialName("url")
    var url: String
)
