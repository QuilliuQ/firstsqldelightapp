package ru.sylas.androidsqldelightapp.domain.repository

import ru.sylas.androidsqldelightapp.domain.model.FullName

interface DBRepository {
    fun getFromDB(): List<FullName>

    fun saveInDB(fullName:FullName):Boolean
}