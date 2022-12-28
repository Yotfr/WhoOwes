package com.example.whoowes.data.local.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.whoowes.data.local.room.entities.DebtEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface DebtDao {
    @Insert(onConflict = REPLACE)
    suspend fun insertDebt(debtEntity: DebtEntity)

    @Delete
    suspend fun deleteDebt(debtEntity: DebtEntity)

    @Query("SELECT * FROM debts")
    fun getALlDebts(): Flow<List<DebtEntity>>
}
