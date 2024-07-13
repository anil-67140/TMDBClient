package com.deora.tmdbclient.presentation.di.movie

import com.deora.tmdbclient.presentation.artist.ArtistActivity
import com.deora.tmdbclient.presentation.movie.MovieActivity
import dagger.Subcomponent


@MovieScope
@Subcomponent(modules = [
    MovieModule::class
])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity)
    @Subcomponent.Factory
    interface Factory{
        fun create():MovieSubComponent
    }
}