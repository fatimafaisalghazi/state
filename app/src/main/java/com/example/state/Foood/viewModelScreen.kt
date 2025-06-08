package com.example.state.Foood

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun FoodScreen(viewModel: FoodViewModel = koinViewModel()) {
    val state by viewModel.state.collectAsState()
    FoodContent(state = state)

}

fun FoodContent(
    state: FoodUIState
) {
}

@Composable
fun MealItem(meal: MealUIState) {

}