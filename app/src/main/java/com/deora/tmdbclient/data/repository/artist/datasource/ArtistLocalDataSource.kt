package com.deora.tmdbclient.data.repository.artist.datasource

import com.deora.tmdbclient.data.model.artist.Artist
import com.deora.tmdbclient.data.model.movie.Movie

interface ArtistLocalDataSource  {
    suspend fun getArtistsFromDB():List<Artist>
    suspend fun saveArtistsToDB(artists :List<Artist>)
    suspend fun clearAll()
}