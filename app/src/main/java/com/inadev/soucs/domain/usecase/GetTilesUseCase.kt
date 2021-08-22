package com.inadev.soucs.domain.usecase

import com.inadev.soucs.domain.repository.TileRepository
import javax.inject.Inject

class GetTilesUseCase @Inject constructor(private val repository: TileRepository) {

    fun getTileList() = repository.getTiles()
}