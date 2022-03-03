package ru.sylas.androidsqldelightapp.domain.usecase

import ru.sylas.androidsqldelightapp.domain.model.FullName
import ru.sylas.androidsqldelightapp.domain.repository.DBRepository

class SaveInDBUseCase(private val dbRepository: DBRepository) {
    fun execute(fullName: FullName) = dbRepository.saveInDB(fullName)
}