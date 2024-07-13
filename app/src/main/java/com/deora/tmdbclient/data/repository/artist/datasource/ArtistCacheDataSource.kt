package com.deora.tmdbclient.data.repository.artist.datasource

import com.deora.tmdbclient.data.model.artist.Artist
import com.deora.tmdbclient.data.model.movie.Movie

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists: List<Artist>)
}