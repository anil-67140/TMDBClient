package com.deora.tmdbclient.domain.repository

import com.deora.tmdbclient.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun  updateMovies():List<Movie>?
}