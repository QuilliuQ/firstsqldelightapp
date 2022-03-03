package ru.sylas.androidsqldelightapp.domain.usecase

import ru.sylas.androidsqldelightapp.domain.model.FullName
import ru.sylas.androidsqldelightapp.domain.repository.DBRepository

class GetFromDBUseCase(private val dbRepository: DBRepository) {
    fun execute() = dbRepository.getFromDB()
}