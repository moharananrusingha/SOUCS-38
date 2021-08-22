package com.inadev.soucs.data.source.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.inadev.soucs.domain.model.Tile
import kotlinx.coroutines.flow.Flow


/**
 * The Data Access Object for the Plant class.
 */
@Dao
interface TileDao {
    @Query("SELECT * FROM tiles ORDER BY sortId")
    fun getTiles(): Flow<List<Tile>>

    @Query("SELECT * FROM tiles WHERE id = :tileId")
    fun getTile(tileId: String): Flow<Tile>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(plants: List<Tile>)
}