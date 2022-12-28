package com.example.whoowes.data.local.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "debts"
)
data class DebtEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val amount: Long,
    val createdDate: Long,
    val dueDate: Long,
    val message: String,
    val personId: Long
)
