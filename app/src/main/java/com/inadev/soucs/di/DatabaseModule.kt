package com.inadev.soucs.di

import android.content.Context
import com.inadev.soucs.data.repository.TileRepositoryImpl
import com.inadev.soucs.data.source.local.AppDatabase
import com.inadev.soucs.data.source.local.dao.TileDao
import com.inadev.soucs.domain.repository.TileRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Provides
    internal fun provideTileDao(appDatabase: AppDatabase): TileDao {
        return appDatabase.tileDao()
    }
    @Singleton
    @Provides
    fun provideTileRepository(
        tileDao: TileDao
    ): TileRepository {
        return TileRepositoryImpl(tileDao)
    }
}