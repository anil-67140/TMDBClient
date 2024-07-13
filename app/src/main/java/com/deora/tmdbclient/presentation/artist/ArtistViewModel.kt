package com.deora.tmdbclient.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.deora.tmdbclient.domain.usecase.GetArtistsUseCase
import com.deora.tmdbclient.domain.usecase.UpdateArtistsUseCase

class ArtistViewModel(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase

):ViewModel() {
    fun getArtists() = liveData {
        val artistList =getArtistsUseCase.execute()
        emit(artistList)
    }
    fun updateArtists()= liveData {
        val updateList= updateArtistsUseCase.execute()
        emit(updateList)
    }
}