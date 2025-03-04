package com.deora.tmdbclient.data.repository.tvshow.datasource

import com.deora.tmdbclient.data.model.tvshow.TvShow

interface TvShowLocalDataSource  {
    suspend fun getTvShowsFromDB():List<TvShow>
    suspend fun saveTvShowsToDB(tvShows :List<TvShow>)
    suspend fun clearAll()
}