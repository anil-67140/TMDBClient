package com.deora.tmdbclient.presentation.di.core

import com.deora.tmdbclient.domain.repository.ArtistRepository
import com.deora.tmdbclient.domain.repository.MovieRepository
import com.deora.tmdbclient.domain.repository.TvShowRepository
import com.deora.tmdbclient.domain.usecase.GetArtistsUseCase
import com.deora.tmdbclient.domain.usecase.GetMoviesUseCase
import com.deora.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.deora.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.deora.tmdbclient.domain.usecase.UpdateMoviesUsecase
import com.deora.tmdbclient.domain.usecase.UpdateTvShowsUseCase
import com.deora.tmdbclient.data.model.artist.Artist
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {
//////movies
    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository): GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }
    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUsecase {
        return UpdateMoviesUsecase(movieRepository)
    }
    /////tv-show
    @Provides
    fun provideGetTvShowUseCase(tvShowRepository: TvShowRepository): GetTvShowsUseCase {
        return GetTvShowsUseCase(tvShowRepository)
    }
    @Provides
    fun provideUpdateTvShowUseCase(tvShowRepository: TvShowRepository): UpdateTvShowsUseCase {
        return UpdateTvShowsUseCase(tvShowRepository)
    }
    ///////Artist
    @Provides
    fun provideGetArtistUseCase(artistRepository: ArtistRepository): GetArtistsUseCase {
        return GetArtistsUseCase(artistRepository)
    }
    @Provides
    fun provideUpdateArtistUseCase(artistRepository: ArtistRepository): UpdateArtistsUseCase {
        return UpdateArtistsUseCase(artistRepository)
    }

}