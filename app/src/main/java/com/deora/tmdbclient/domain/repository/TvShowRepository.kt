package com.deora.tmdbclient.domain.repository

import com.deora.tmdbclient.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun  updateTvShows():List<TvShow>?
}