package com.deora.tmdbclient.presentation.di.artist

import com.deora.tmdbclient.presentation.artist.ArtistActivity
import dagger.Subcomponent


@ArtistScope
@Subcomponent(modules = [
    ArtistModule::class
])
interface ArtistSubComponent {
    fun inject(artistActivity: ArtistActivity)
    @Subcomponent.Factory
    interface Factory{
        fun create():ArtistSubComponent
    }
}