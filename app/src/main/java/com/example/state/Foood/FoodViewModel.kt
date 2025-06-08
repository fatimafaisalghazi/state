package com.example.state.Foood

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class FoodViewModel {

    private val _state = MutableStateFlow(FoodUIState())
    val state = _state.asStateFlow()

    init {
        getFood()
    }

    private fun getFood() {
        _state.update {
            it.copy(
                meals = listOf(
                    MealUIState("", ""),
                    MealUIState("", ""),
                    MealUIState("", ""),
                    MealUIState("", ""),
                )
            )
        }
    }
    fun onClickMeal(meal :MealUIState){

    }
}
