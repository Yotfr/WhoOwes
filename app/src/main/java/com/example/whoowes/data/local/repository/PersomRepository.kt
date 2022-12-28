package com.example.whoowes.data.local.repository

import com.example.whoowes.data.local.room.PersonDao
import com.example.whoowes.data.local.room.entities.PersonEntity
import com.example.whoowes.data.local.room.relations.PersonWithDebts
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PersomRepository @Inject constructor(
    private val personDao: PersonDao
) {
    suspend fun createPerson(personEntity: PersonEntity) {
        personDao.insertPerson(personEntity = personEntity)
    }
    suspend fun deletePerson(personEntity: PersonEntity) {
        personDao.deletePerson(personEntity = personEntity)
    }
    fun getAllPersonsWithDebts(): Flow<List<PersonWithDebts>> {
        return personDao.getAllPersonsWithDebts()
    }
}