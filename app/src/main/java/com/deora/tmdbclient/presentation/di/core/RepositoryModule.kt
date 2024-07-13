package com.deora.tmdbclient.presentation.di.core

import com.deora.tmdbclient.domain.repository.ArtistRepository
import com.deora.tmdbclient.domain.repository.MovieRepository
import com.deora.tmdbclient.domain.repository.TvShowRepository
import com.deora.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.deora.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.deora.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.deora.tmdbclient.data.repository.artist.datasourceImpl.ArtistRepositoryImpl
import com.deora.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.deora.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.deora.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.deora.tmdbclient.data.repository.movie.datasourceImpl.MovieRepositoryImpl
import com.deora.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.deora.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.deora.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.deora.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowRepositoryImpl
import dagger.Provides
import javax.inject.Singleton

class RepositoryModule {
    @Singleton
    @Provides
    fun provideMovieRepository(movieRemoteDatasource:MovieRemoteDataSource,
                               movieLocalDataSource: MovieLocalDataSource,
                               movieCacheDataSource: MovieCacheDataSource
                               ): MovieRepository {
        return MovieRepositoryImpl(movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource)

    }
    @Singleton
    @Provides
    fun provideTvShowRepository(tvShowRemoteDatasource: TvShowRemoteDataSource,
                                tvShowLocalDataSource: TvShowLocalDataSource,
                                tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {
        return TvShowRepositoryImpl(tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource)

    }
    @Singleton
    @Provides
    fun provideArtistRepository(artistRemoteDatasource: ArtistRemoteDataSource,
                                artistLocalDataSource: ArtistLocalDataSource,
                                artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {
        return ArtistRepositoryImpl(artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource)

    }
}