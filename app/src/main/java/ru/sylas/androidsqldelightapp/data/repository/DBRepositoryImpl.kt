package ru.sylas.androidsqldelightapp.data.repository

import ru.sylas.androidsqldelightapp.data.storage.DBStorage
import ru.sylas.androidsqldelightapp.domain.repository.DBRepository
import ru.sylas.androidsqldelightapp.sqldelight.database.Users

class DBRepositoryImpl(private val dbStorage: DBStorage):DBRepository {
    override fun getFromDB(): List<Users> {
        return dbStorage.getFromDB()
    }

    override fun saveInDB(user: Users): Boolean {
        return dbStorage.saveInDB(user)
    }
}