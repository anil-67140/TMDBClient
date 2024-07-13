package com.deora.tmdbclient.presentation.di.tvshow

import com.deora.tmdbclient.presentation.artist.ArtistActivity
import com.deora.tmdbclient.presentation.movie.MovieActivity
import com.deora.tmdbclient.presentation.tv.TvShowActivity
import dagger.Subcomponent


@TvShowScope
@Subcomponent(modules = [
    TvShowModule::class
])
interface TvShowSubComponent {
    fun inject(tvShowActivity: TvShowActivity)
    @Subcomponent.Factory
    interface Factory{
        fun create():TvShowSubComponent
    }
}