package com.deora.tmdbclient.presentation.tv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.deora.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.deora.tmdbclient.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModel(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
):ViewModel() {
    fun getTvShows() = liveData {
        val tvShowList =getTvShowsUseCase.execute()
        emit(tvShowList)
    }
    fun updateTvShows()= liveData {
        val tvShowList =getTvShowsUseCase.execute()
        emit(tvShowList)
    }
}