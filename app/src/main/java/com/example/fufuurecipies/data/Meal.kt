package com.example.fufuurecipies.data

import java.io.Serializable

data class Meal(
    val id: Int,
    val name: String,
    val description: String,
    val duration : String,
    val Ingredients: String,
    val Steps: String,
    val mealImageId: Int = 0


) :Serializable