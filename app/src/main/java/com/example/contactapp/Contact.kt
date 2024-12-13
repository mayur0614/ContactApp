package com.example.contactapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact (
    @PrimaryKey(autoGenerate = true)
    val id :Int = 0 ,
    val firstname :String,
    val lastname :String,
    val phoneNumber :String
)