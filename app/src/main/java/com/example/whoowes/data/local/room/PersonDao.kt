package com.example.whoowes.data.local.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Transaction
import com.example.whoowes.data.local.room.entities.PersonEntity
import com.example.whoowes.data.local.room.relations.PersonWithDebts
import kotlinx.coroutines.flow.Flow

@Dao
interface PersonDao {

    @Insert(onConflict = REPLACE)
    suspend fun insertPerson(personEntity: PersonEntity)

    @Delete
    suspend fun deletePerson(personEntity: PersonEntity)

    @Transaction
    @Query("SELECT * FROM person")
    fun getAllPersonsWithDebts(): Flow<List<PersonWithDebts>>
}
