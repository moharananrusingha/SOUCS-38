package com.inadev.soucs.domain.repository

import androidx.lifecycle.LiveData
import com.inadev.soucs.domain.model.Tile

interface TileRepository {
    fun getTiles(): LiveData<List<Tile>>
}