package com.deora.tmdbclient.data.repository.artist.datasourceImpl

import com.deora.tmdbclient.data.db.ArtistDao
import com.deora.tmdbclient.data.model.artist.Artist
import com.deora.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistLocalDataSourceImpl(private val artistDao: ArtistDao): ArtistLocalDataSource {
    override suspend fun getArtistsFromDB(): List<Artist> {
          return artistDao.getArtists()
    }

    override suspend fun saveArtistsToDB(artists: List<Artist>) {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.saveArtists(artists)
        }
    }

    override suspend fun clearAll() {
      CoroutineScope(Dispatchers.IO).launch {
          artistDao.deleteAllArtists()
      }
    }
}