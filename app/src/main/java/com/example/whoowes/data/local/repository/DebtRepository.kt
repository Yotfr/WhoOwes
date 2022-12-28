package com.example.whoowes.data.local.repository

import com.example.whoowes.data.local.room.DebtDao
import com.example.whoowes.data.local.room.entities.DebtEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DebtRepository @Inject constructor(
    private val debtDao: DebtDao
) {
    suspend fun createDebt(debtEntity: DebtEntity) {
        debtDao.insertDebt(debtEntity = debtEntity)
    }
    suspend fun deleteDebt(debtEntity: DebtEntity) {
        debtDao.deleteDebt(debtEntity = debtEntity)
    }
    fun getAllDebts():Flow<List<DebtEntity>> {
        return debtDao.getALlDebts()
    }
}