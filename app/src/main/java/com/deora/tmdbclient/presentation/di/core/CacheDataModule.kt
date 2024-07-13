package com.deora.tmdbclient.presentation.di.core

import com.deora.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.deora.tmdbclient.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.deora.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.deora.tmdbclient.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.deora.tmdbclient.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.deora.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.deora.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource():MovieCacheDataSource{
        return MovieCacheDataSourceImpl()
    }
    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }
    @Singleton
    @Provides
    fun provideTvShowDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }
}