package com.example.newkotlinretro.model

import kotlinx.serialization.*

@Serializable
data class ItemsData(
    @SerialName("login")
    var login: String,
    @SerialName("type")
    var type: String,
    @SerialName("avatar_url")
    var avatar: String,
    @SerialName("node_id")
    var id: String,
    @SerialName("url")
    var url: String
)
