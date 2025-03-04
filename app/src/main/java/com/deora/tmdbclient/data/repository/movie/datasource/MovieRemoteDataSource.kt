package com.deora.tmdbclient.data.repository.movie.datasource

import com.deora.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies():Response<MovieList>
}