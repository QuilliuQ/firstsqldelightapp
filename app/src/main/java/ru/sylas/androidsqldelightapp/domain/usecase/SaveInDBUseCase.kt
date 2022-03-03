package ru.sylas.androidsqldelightapp.domain.usecase

import ru.sylas.androidsqldelightapp.domain.repository.DBRepository
import ru.sylas.androidsqldelightapp.sqldelight.database.Users


class SaveInDBUseCase(private val dbRepository: DBRepository) {
    fun execute(user: Users) = dbRepository.saveInDB(user)
}