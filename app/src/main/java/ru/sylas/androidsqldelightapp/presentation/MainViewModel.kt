package ru.sylas.androidsqldelightapp.presentation

import androidx.lifecycle.ViewModel
import ru.sylas.androidsqldelightapp.domain.model.FullName
import ru.sylas.androidsqldelightapp.domain.usecase.GetFromDBUseCase
import ru.sylas.androidsqldelightapp.domain.usecase.SaveInDBUseCase

class MainViewModel(
    private val getFromDBUseCase: GetFromDBUseCase,
    private val saveInDBUseCase: SaveInDBUseCase
): ViewModel() {
    fun save(
    ){
            saveInDBUseCase.execute(
                FullName(
                    firstName = "lol",
                    "lololol"
                )
            )
    }

    fun getusers():List<FullName>{
        return getFromDBUseCase.execute()
    }
}