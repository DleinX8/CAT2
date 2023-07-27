package com.example.fufuurecipies.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.fufuurecipies.data.Meal

@Dao
interface RecipeDao {

    @get:Query("SELECT * FROM Recipies ORDER BY id DESC")
    val recipies : List<Meal>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(Recipies:Meal)
}