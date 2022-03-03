package ru.sylas.androidsqldelightapp.domain.repository

import ru.sylas.androidsqldelightapp.sqldelight.database.Users

interface DBRepository {
    fun getFromDB(): List<Users>

    fun saveInDB(user:Users):Boolean
}