package com.deora.tmdbclient.presentation.di.tvshow

import com.deora.tmdbclient.domain.usecase.GetArtistsUseCase
import com.deora.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.deora.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.deora.tmdbclient.domain.usecase.UpdateTvShowsUseCase
import com.deora.tmdbclient.presentation.artist.ArtistViewModelFactory
import com.deora.tmdbclient.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides


@Module
class TvShowModule
     {
         @TvShowScope
         @Provides
         fun provideTvShowViewModelFactory(getTvShowsUseCase: GetTvShowsUseCase,
                                           updateTvShowsUseCase: UpdateTvShowsUseCase
         ):TvShowViewModelFactory{

             return TvShowViewModelFactory(getTvShowsUseCase, updateTvShowsUseCase)
         }




}