package com.example.whoowes.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.whoowes.data.local.room.entities.DebtEntity
import com.example.whoowes.data.local.room.entities.PersonEntity

@Database(
    version = 1,
    entities = [
        DebtEntity::class,
        PersonEntity::class
    ]
)
abstract class AppDatabase: RoomDatabase() {
    abstract val debtDao: DebtDao
    abstract val personDao: PersonDao
}
