package com.deora.tmdbclient.domain.usecase

import com.deora.tmdbclient.domain.repository.ArtistRepository
import com.deora.tmdbclient.data.model.artist.Artist

class GetArtistsUseCase (private val artistRepository: ArtistRepository){
    suspend fun execute():List<Artist>?=artistRepository.getArtists()



}