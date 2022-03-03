package ru.sylas.androidsqldelightapp.domain.model

import ru.sylas.androidsqldelightapp.sqldelight.database.Users

data class FullName(
    val firstName: String,
    val lastName:String
)

fun Users.toFullName():FullName{
    return FullName(
        firstName,
        lastName
    )
}
