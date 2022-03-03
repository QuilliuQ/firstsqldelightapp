package ru.sylas.androidsqldelightapp.data.storage

import ru.sylas.androidsqldelightapp.sqldelight.database.Users

interface DBStorage {
    fun getFromDB(): List<Users>

    fun saveInDB(user: Users):Boolean
}