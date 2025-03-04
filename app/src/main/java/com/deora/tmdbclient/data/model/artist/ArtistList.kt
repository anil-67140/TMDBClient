package com.deora.tmdbclient.data.model.artist


import com.deora.tmdbclient.data.model.artist.Artist
import com.google.gson.annotations.SerializedName

data class ArtistList(
//    @SerializedName("page")
//    val page: Int,
    @SerializedName("results")
    val artists: List<Artist>,
//    @SerializedName("total_pages")
//    val totalPages: Int,
//    @SerializedName("total_results")
//    val totalResults: Int
)