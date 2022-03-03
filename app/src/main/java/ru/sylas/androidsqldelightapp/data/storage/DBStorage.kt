package ru.sylas.androidsqldelightapp.data.storage

import ru.sylas.androidsqldelightapp.domain.model.FullName

interface DBStorage {
    fun getFromDB(): List<FullName>

    fun saveInDB(fullName: FullName):Boolean
}