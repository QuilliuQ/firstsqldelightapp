package ru.sylas.androidsqldelightapp.data.storage

import com.squareup.sqldelight.db.SqlDriver
import ru.sylas.androidsqldelightapp.Database
import ru.sylas.androidsqldelightapp.domain.model.FullName
import ru.sylas.androidsqldelightapp.domain.model.toFullName
import java.lang.Exception

class DBStorageImpl(private val sqlDriver: SqlDriver):DBStorage {
    private val db = Database(sqlDriver)
    override fun getFromDB(): List<FullName> {
       return db.myDatabaseQueries.selectAll().executeAsList().map { user->
            user.toFullName()
       }
    }

    override fun saveInDB(fullName: FullName): Boolean {
        return try {
            db.myDatabaseQueries.insert(
                firstName = fullName.firstName,
                lastName = fullName.lastName
            )
            true
        }
        catch (e:Exception){
            println(e.localizedMessage)
            false
        }
    }
}