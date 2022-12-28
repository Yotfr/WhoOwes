package com.example.whoowes.data.local.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "person"
)
data class PersonEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val name: String
)
