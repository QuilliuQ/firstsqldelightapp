package ru.sylas.androidsqldelightapp.di

import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import org.koin.dsl.module
import ru.sylas.androidsqldelightapp.Database
import ru.sylas.androidsqldelightapp.data.storage.DBStorage
import ru.sylas.androidsqldelightapp.data.storage.DBStorageImpl

val databaseModule = module {
    single<SqlDriver> {
        AndroidSqliteDriver(
            Database.Schema,
            get(),
            "mydb.db"
        )
    }
    single<DBStorage> { DBStorageImpl(get()) }

}