package com.example.roomdbdemo

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ContactDao {
    @Insert
    suspend fun insertContact(contact: Contact)
    @Query("SELECT * FROM contact" )
    suspend fun getContact():List<Contact>

}