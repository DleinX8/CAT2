package com.example.fufuurecipies.data

import com.example.fufuurecipies.R

object Provider {
    val meal =
        Meal(
            id = 1,
            name = "Mayai Mwitu",
            mealtype = "Breakfast",
            servings = "1",
            difficulty = "Easy",
            description ="Deviled Eggs(Facelifted Eggs) With Uber-Kenyan Kachumbari ",
            duration = "1 Hour",
            Ingredients ="2 Matoke" +
                    "3 Eggs" +
                    "1 Curry Powder Sachet" +
                    "1/2 cup Vegetable Oil" +
                    "1 Tomato" +
                    "1 Red Onion" +
                    "1 dhania bunch" +
                    "1 Lemon",
            Steps ="",
            mealImageId = R.drawable.img1
        )
    val mealList = listOf(
        Meal(
            id = 1,
            name = "Mayai Mwitu",
            mealtype = "Breakfast",
            servings = "1",
            difficulty = "Intermediate",
            description ="Deviled Eggs(Facelifted Eggs) With Uber-Kenyan Kachumbari ",
            duration = "1 Hour",
            Ingredients ="2 Matoke" +
                    "3 Eggs" +
                    "1 Curry Powder Sachet" +
                    "1/2 cup Vegetable Oil" +
                    "1 Tomato" +
                    "1 Red Onion" +
                    "1 dhania bunch" +
                    "1 Lemon",
            Steps ="",
            mealImageId = R.drawable.img1
        ),
        Meal(
            id = 2,
            name = "Ugali Choma",
            mealtype = "Lunch",
            servings = "3",
            difficulty = "Easy",
            description ="Deviled Eggs With Uber-Kenyan Kachumbari",
            duration = "pikavizuri",
            Ingredients ="this and that",
            Steps ="",
            mealImageId = R.drawable.img2
        ),
        Meal(
            id = 3,
            name = "Wet Chicken",
            mealtype = "Dinner",
            servings = "4",
            difficulty = "Intermediate",
            description ="Deviled Eggs With Uber-Kenyan Kachumbari",
            duration = "pikavizuri",
            Ingredients ="this and that",
            Steps ="",
            mealImageId = R.drawable.img3
        ),
        Meal(
            id = 4,
            name = "Pilau",
            mealtype = "Dinner",
            servings = "4",
            difficulty = "Hard",
            description ="Deviled Eggs With Uber-Kenyan Kachumbari ",
            duration = "pikavizuri",
            Ingredients ="this and that",
            Steps ="",
            mealImageId = R.drawable.img4
        ),
        Meal(
            id = 5,
            name = "Meatballs",
            mealtype = "Lunch",
            servings = "6",
            difficulty = "Intermediate",
            description ="Deviled Eggs With Uber-Kenyan Kachumbari",
            duration = "pikavizuri",
            Ingredients ="this and that",
            Steps ="",
            mealImageId = R.drawable.img6
        ),


        )
}

