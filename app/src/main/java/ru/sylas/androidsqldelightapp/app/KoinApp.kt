package ru.sylas.androidsqldelightapp.app

import android.app.Application
import android.os.Build
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import ru.sylas.androidsqldelightapp.BuildConfig
import ru.sylas.androidsqldelightapp.di.databaseModule
import ru.sylas.androidsqldelightapp.di.domainModule
import ru.sylas.androidsqldelightapp.di.presentationModule

class KoinApp:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger(Level.NONE)
            androidContext(this@KoinApp)
            modules(databaseModule, presentationModule, domainModule)
        }
    }
}