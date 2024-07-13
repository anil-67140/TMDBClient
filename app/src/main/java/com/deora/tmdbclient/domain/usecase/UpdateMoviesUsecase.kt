package com.deora.tmdbclient.domain.usecase

import com.deora.tmdbclient.domain.repository.MovieRepository
import com.deora.tmdbclient.data.model.movie.Movie

class UpdateMoviesUsecase (private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>?=movieRepository.updateMovies()
}