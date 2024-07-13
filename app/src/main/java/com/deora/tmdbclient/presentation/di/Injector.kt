package com.deora.tmdbclient.presentation.di

import com.deora.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.deora.tmdbclient.presentation.di.movie.MovieSubComponent
import com.deora.tmdbclient.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMoviesSubComponent():MovieSubComponent
    fun createTvShowSubComponent():TvShowSubComponent
    fun createArtistSubComponent():ArtistSubComponent
}