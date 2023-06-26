package com.example.fufuurecipies

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.fufuurecipies.data.Meal
import com.example.fufuurecipies.data.Provider

@Composable
fun FuFuHomeContent( navigateToProfile: (Meal) -> Unit){
    val Meals = remember { Provider.mealList}
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 15.dp, vertical = 8.dp)
    ) {
        items(
            items= Meals,
            itemContent = {
                MealListItem(meal = it, navigateToProfile)
            }
        )
    }
}
