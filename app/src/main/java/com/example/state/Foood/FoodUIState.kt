package com.example.state.Foood

data class FoodUIState(
    val meals : List<MealUIState> = emptyList()
)

data class MealUIState(
    val name :String,
    val imageUTL : String
)