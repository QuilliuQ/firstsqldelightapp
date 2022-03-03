package ru.sylas.androidsqldelightapp.data.storage

import com.squareup.sqldelight.db.SqlDriver
import ru.sylas.androidsqldelightapp.Database
import ru.sylas.androidsqldelightapp.sqldelight.database.Users
import java.lang.Exception

class DBStorageImpl(private val sqlDriver: SqlDriver):DBStorage {
    private val db = Database(sqlDriver)
    override fun getFromDB(): List<Users> {
       return db.myDatabaseQueries.selectAll().executeAsList()
    }

    override fun saveInDB(user: Users): Boolean {
        return try {
            db.myDatabaseQueries.insert(
                firstName = user.firstName,
                lastName = user.lastName
            )
            true
        }
        catch (e:Exception){
            println(e.localizedMessage)
            false
        }
    }
}