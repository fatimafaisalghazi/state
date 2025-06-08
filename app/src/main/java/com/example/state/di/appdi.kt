package com.example.state.di



import com.example.state.viewModel.CounterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { CounterViewModel() }
}