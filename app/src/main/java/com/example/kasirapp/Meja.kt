package com.example.kasirapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Meja(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var number : Int
)
