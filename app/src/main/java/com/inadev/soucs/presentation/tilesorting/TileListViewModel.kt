package com.inadev.soucs.presentation.tilesorting

import androidx.lifecycle.*
import com.inadev.soucs.domain.model.Tile
import com.inadev.soucs.domain.usecase.GetTilesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class TileListViewModel @Inject constructor(private val getTileListUseCase: GetTilesUseCase): ViewModel(), LifecycleObserver {

    fun loadTiles(): LiveData<List<Tile>> = getTileListUseCase.getTileList()

}