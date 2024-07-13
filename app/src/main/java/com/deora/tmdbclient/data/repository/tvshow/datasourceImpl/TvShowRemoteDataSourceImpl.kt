package com.deora.tmdbclient.data.repository.tvshow.datasourceImpl

import com.deora.tmdbclient.data.api.TMDBService
import com.deora.tmdbclient.data.model.tvshow.TvShowList
import com.deora.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(private val tmdbService: TMDBService,
                                 private val apiKey:String


): TvShowRemoteDataSource {
    override suspend fun getTvShows(): Response<TvShowList> {
         return tmdbService.getPopularTvShows(apiKey)
    }
}