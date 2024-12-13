package com.example.contactapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {

    @Upsert
    suspend fun upsertContact(contact: Contact)

    @Delete
    suspend fun deleteContact(contact: Contact)

    @Query("select * from contact order by firstName Asc")
    fun getContactOrderByFirstName(): Flow<List<Contact>>

    @Query("select * from contact order by lastName Asc")
    fun getContactOrderByLastName(): Flow<List<Contact>>

    @Query("select * from contact order by phoneNumber Asc")
    fun getContactOrderByPhoneNumber(): Flow<List<Contact>>


}