package com.deora.tmdbclient.data.model.tvshow


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "popular_tvShows")
data class TvShow(

    @SerializedName("first_air_date")
    val firstAirDate: String?,
    @PrimaryKey
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String?,
    @SerializedName("poster_path")
    val posterPath: String?,

    @SerializedName("overview")
    val overview: String?
    //    @SerializedName("genre_ids")
//    val genreIds: List<Int>,
//    @SerializedName("popularity")
//    val popularity: Double,

//    @SerializedName("vote_average")
//    val voteAverage: Double,
//    @SerializedName("vote_count")
//    val voteCount: Int
    //    @SerializedName("adult")
//    val adult: Boolean,
//    @SerializedName("backdrop_path")
//    val backdropPath: String,
    //    @SerializedName("origin_country")
//    val originCountry: List<String>,
//    @SerializedName("original_language")
//    val originalLanguage: String,
//    @SerializedName("original_name")
//    val originalName: String,
)