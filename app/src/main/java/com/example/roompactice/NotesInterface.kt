package com.example.roompactice

import androidx.constraintlayout.motion.widget.KeyPosition
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface NotesInterface {
    @Insert
    fun add(notesEntity: NotesEntity)

    @Query("SELECT * FROM NotesEntity")
    fun get(): List<NotesEntity>

    @Delete
    fun delete(notesEntity: NotesEntity)

    @Query("UPDATE NotesEntity SET title=(:title),description=(:description) WHERE id=(:id)")
    fun update(id:Int,title:String,description:String)

}
