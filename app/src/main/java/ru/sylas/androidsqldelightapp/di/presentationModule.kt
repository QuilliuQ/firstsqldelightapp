package ru.sylas.androidsqldelightapp.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.sylas.androidsqldelightapp.presentation.MainViewModel

val presentationModule = module {

    viewModel { MainViewModel(get(),get()) }
}