package com.example.fufuurecipies

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.fufuurecipies.data.Meal
import com.example.fufuurecipies.ui.theme.FuFuuRecipiesTheme


class FuFuActivity : ComponentActivity() {
    private val meal: Meal by lazy {
        intent?.getSerializableExtra(MEAL_ID) as Meal
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            FuFuuRecipiesTheme{
                MealScreen(meal = meal)

                
            }

        }
    }
    companion object{
        private const val MEAL_ID ="Meal Id"
        fun newIntent(context: Context,meal: Meal) =Intent(context, FuFuActivity::class.java).apply {
            putExtra(MEAL_ID, meal)
        }
    }
}