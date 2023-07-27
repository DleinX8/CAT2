package com.example.fufuurecipies

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

import com.example.fufuurecipies.data.Meal

@Preview
@Composable
fun MealScreen(meal: Meal){
    val scrollState = rememberScrollState()
    
    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            androidx.compose.material3.Surface {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState)
                ) {
                    ProfileHeader(meal = meal, containerHeight = this@BoxWithConstraints.maxHeight)
                    ProfileContent(meal = meal, containerHeight = this@BoxWithConstraints.maxHeight )
                }

                
            }
        }
        
    }
}
@Preview
@Composable
private fun ProfileHeader(
    meal: Meal,
    containerHeight: Dp
){
    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth(),
        painter = painterResource(id = meal.mealImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}
@Preview
@Composable
private fun ProfileContent(meal: Meal,containerHeight: Dp){
    Column() {
        Name(meal = meal)
        ProfileProperty(label = stringResource(id =R.string.Description ), value = meal.description)
        ProfileProperty(label = stringResource(id =R.string.mealtype ), value = meal.mealtype)
        ProfileProperty(label = stringResource(id =R.string.difficulty ), value = meal.difficulty)
        ProfileProperty(label = stringResource(id =R.string.servings), value = meal.servings)
        ProfileProperty(label = stringResource(id =R.string.duration ), value = meal.duration)
        ProfileProperty(label = stringResource(id = R.string.ingredients), value = meal.Ingredients.toString())
        ProfileProperty(label = stringResource(id = R.string.steps), value = meal.Steps )

        Spacer(modifier = Modifier.height((containerHeight-320.dp).coerceAtLeast(0.dp)))
    }

}
@Preview
@Composable
private fun Name(meal: Meal){
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text=meal.name,
            style = MaterialTheme.typography.displaySmall,
            overflow = TextOverflow.Visible,
            fontWeight = FontWeight.Bold
            )
        
    }
}
@Preview
@Composable
private fun ProfileProperty(label:String, value:String){
    Column(modifier = Modifier.padding(16.dp)) {
        Divider(modifier = Modifier.padding(bottom = 4.dp))
        Text(text = label,
        modifier = Modifier.height(24.dp),
        style = MaterialTheme.typography.titleLarge,
            overflow = TextOverflow.Visible,
                fontWeight = FontWeight.SemiBold
        )
        Text(
            text = value,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Visible,
            fontWeight = FontWeight.Normal

        )
    }
}