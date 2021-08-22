package com.inadev.soucs.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import com.inadev.soucs.data.source.local.dao.TileDao
import com.inadev.soucs.domain.model.Tile
import com.inadev.soucs.domain.repository.TileRepository

class TileRepositoryImpl(private val tileDao: TileDao): TileRepository {

    override fun getTiles(): LiveData<List<Tile>> {
        return tileDao.getTiles().asLiveData()
    }
}