package com.deora.tmdbclient.data.repository.artist.datasource

import com.deora.tmdbclient.data.model.artist.ArtistList
import com.deora.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists():Response<ArtistList>
}