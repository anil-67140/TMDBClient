package com.deora.tmdbclient.domain.repository

import com.deora.tmdbclient.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun  updateArtists():List<Artist>?
}