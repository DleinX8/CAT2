package com.example.fufuurecipies

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fufuurecipies.data.Meal


@Preview
@Composable
fun MealListItem(meal: Meal, navigateToProfile: (Meal) -> Unit) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(corner = CornerSize(16.dp))

        ){
        Row(
            modifier = Modifier.clickable { navigateToProfile(meal) }
        ) {
            MealImage(meal = meal)
            Column (
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ){
                Text(text = meal.name, style = MaterialTheme.typography.displaySmall)
                Text(text = "View Description", style = MaterialTheme.typography.labelLarge)
            }
        }
    }
}
@Composable
private fun MealImage(meal: Meal){
    Image(
        painter = painterResource(id = meal.mealImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(85.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}