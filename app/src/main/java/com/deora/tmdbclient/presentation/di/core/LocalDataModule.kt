package com.deora.tmdbclient.presentation.di.core

import com.deora.tmdbclient.data.db.ArtistDao
import com.deora.tmdbclient.data.db.MovieDao
import com.deora.tmdbclient.data.db.TvShowDao
import com.deora.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.deora.tmdbclient.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.deora.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.deora.tmdbclient.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.deora.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.deora.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
          return MovieLocalDataSourceImpl(movieDao)
    }
    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao):ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao):TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }
}