package com.deora.tmdbclient.presentation.di.movie

import com.deora.tmdbclient.domain.usecase.GetArtistsUseCase
import com.deora.tmdbclient.domain.usecase.GetMoviesUseCase
import com.deora.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.deora.tmdbclient.domain.usecase.UpdateMoviesUsecase
import com.deora.tmdbclient.presentation.artist.ArtistViewModelFactory
import com.deora.tmdbclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides


@Module
class MovieModule
     {
         @MovieScope
         @Provides
         fun provideMovieViewModelFactory(getMoviesUseCase: GetMoviesUseCase,
                                          updateMoviesUseCase: UpdateMoviesUsecase
         ): MovieViewModelFactory {

             return MovieViewModelFactory(getMoviesUseCase,updateMoviesUseCase)
         }




}