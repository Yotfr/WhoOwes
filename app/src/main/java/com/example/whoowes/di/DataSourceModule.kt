package com.example.whoowes.di

import android.content.Context
import androidx.room.Room
import com.example.whoowes.data.local.room.AppDatabase
import com.example.whoowes.data.local.room.DebtDao
import com.example.whoowes.data.local.room.PersonDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataSourceModule {

    @Provides
    @Singleton
    fun provideAppDatabases(appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "database"
        ).build()
    }

    @Provides
    fun provideDebtDao(appDatabase: AppDatabase):DebtDao {
        return appDatabase.debtDao
    }

    @Provides
    fun providePersonDao(appDatabase: AppDatabase):PersonDao {
        return appDatabase.personDao
    }

}