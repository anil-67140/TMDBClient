package com.deora.tmdbclient.domain.usecase

import com.deora.tmdbclient.domain.repository.MovieRepository
import com.deora.tmdbclient.data.model.movie.Movie

class GetMoviesUseCase (private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>?=movieRepository.getMovies()

}