package ru.sylas.androidsqldelightapp.data.repository

import ru.sylas.androidsqldelightapp.data.storage.DBStorage
import ru.sylas.androidsqldelightapp.domain.model.FullName
import ru.sylas.androidsqldelightapp.domain.repository.DBRepository

class DBRepositoryImpl(private val dbStorage: DBStorage):DBRepository {
    override fun getFromDB(): List<FullName> {
        return dbStorage.getFromDB()
    }

    override fun saveInDB(fullName: FullName): Boolean {
        return dbStorage.saveInDB(fullName)
    }
}