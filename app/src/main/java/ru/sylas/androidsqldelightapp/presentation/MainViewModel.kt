package ru.sylas.androidsqldelightapp.presentation

import androidx.lifecycle.ViewModel
import org.koin.core.component.getScopeId
import ru.sylas.androidsqldelightapp.domain.usecase.GetFromDBUseCase
import ru.sylas.androidsqldelightapp.domain.usecase.SaveInDBUseCase
import ru.sylas.androidsqldelightapp.sqldelight.database.Users

class MainViewModel(
    private val getFromDBUseCase: GetFromDBUseCase,
    private val saveInDBUseCase: SaveInDBUseCase
): ViewModel() {
    fun save(
    ){
            saveInDBUseCase.execute(
                Users(
                    123,
                    firstName = "lol",
                    lastName = "lololol"
                )
            )
    }

    fun getusers():List<Users>{
        return getFromDBUseCase.execute()
    }
}