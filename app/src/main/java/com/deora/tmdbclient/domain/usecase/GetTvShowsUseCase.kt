package com.deora.tmdbclient.domain.usecase

import com.deora.tmdbclient.domain.repository.TvShowRepository
import com.deora.tmdbclient.data.model.tvshow.TvShow

class GetTvShowsUseCase  (private val tvShowRepository: TvShowRepository){
    suspend fun execute():List<TvShow>?=tvShowRepository.getTvShows()


}