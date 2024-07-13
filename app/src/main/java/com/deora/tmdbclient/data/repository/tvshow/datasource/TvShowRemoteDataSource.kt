package com.deora.tmdbclient.data.repository.tvshow.datasource

import com.deora.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getTvShows():Response<TvShowList>
}