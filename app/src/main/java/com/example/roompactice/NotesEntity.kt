package com.example.roompactice

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Calendar
import java.util.Date

@Entity
data class NotesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var title: String?= null,
    var description: String?= null,

    )
