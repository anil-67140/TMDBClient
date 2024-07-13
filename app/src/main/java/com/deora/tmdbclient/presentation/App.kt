package com.deora.tmdbclient.presentation

import android.app.Application
import com.deora.tmdbclient.BuildConfig
import com.deora.tmdbclient.presentation.di.Injector
import com.deora.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.deora.tmdbclient.presentation.di.core.AppComponent
import com.deora.tmdbclient.presentation.di.core.AppModule
import com.deora.tmdbclient.presentation.di.core.*
import com.deora.tmdbclient.presentation.di.core.NetModule
import com.deora.tmdbclient.presentation.di.core.RemoteDataModule
import com.deora.tmdbclient.presentation.di.movie.MovieSubComponent
import com.deora.tmdbclient.presentation.di.tvshow.TvShowSubComponent

class App:Application(),Injector {
    private lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        //lec 137 time 31:10

//           appComponent=DaggerAppComponent.builder()
//            .appModule(AppModule(applicationContext))
//            .netModule(NetModule(BuildConfig.BASE_URL))
//            .remoteDataModule( RemoteDataModule(BuildConfig.API_KEY))
//            .build()
    }


    override fun createMoviesSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
       return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }


}