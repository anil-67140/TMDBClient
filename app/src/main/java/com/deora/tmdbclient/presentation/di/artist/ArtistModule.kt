package com.deora.tmdbclient.presentation.di.artist

import com.deora.tmdbclient.domain.usecase.GetArtistsUseCase
import com.deora.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.deora.tmdbclient.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides


@Module
class ArtistModule
     {
         @ArtistScope
         @Provides
         fun provideArtistViewModelFactory(getArtistsUseCase: GetArtistsUseCase,
                                           updateArtistsUseCase: UpdateArtistsUseCase
         ):ArtistViewModelFactory{

             return ArtistViewModelFactory(getArtistsUseCase,updateArtistsUseCase)
         }




}