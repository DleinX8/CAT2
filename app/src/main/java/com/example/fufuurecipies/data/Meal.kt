package com.example.fufuurecipies.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Recipies")
data class Meal(
@PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val mealtype: String,
    val servings: String,
    val difficulty: String,
    val description: String,
    val duration : String,
    val Ingredients: String,
    val Steps: String,
    val mealImageId: Int = 0

) :Serializable