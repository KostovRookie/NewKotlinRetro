package com.example.newkotlinretro.model

import kotlinx.serialization.*

@Serializable
data class ListUsers(

    @SerialName("total_count")
    val count: Int,
    @SerialName("incomplete_results")
    val res: Boolean,
    val items : List <ItemsData>
















//    var data: ListUsers?,
//   @SerialName("page")
//var page: Int,
//   @SerialName("per_page")
//var perPage: Int,
//    @SerialName("total")
//var total: Int,
//    @SerialName(
//    "total_pages")
//var totalPages: Int

//    @SerialName("login")
//var login: String,
//@SerialName("type")
//var type: String,
//@SerialName("avatar_url")
//var avatar: String,
//@SerialName("node_id")
//var id: Int,
//@SerialName("url")
//var url: String
)



