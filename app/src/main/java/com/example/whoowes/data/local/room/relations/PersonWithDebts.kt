package com.example.whoowes.data.local.room.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.whoowes.data.local.room.entities.DebtEntity
import com.example.whoowes.data.local.room.entities.PersonEntity

data class PersonWithDebts(
    @Embedded val personEntity: PersonEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "personId"
    )
    val debts: List<DebtEntity>
)