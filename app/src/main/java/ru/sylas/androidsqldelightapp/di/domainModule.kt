package ru.sylas.androidsqldelightapp.di

import org.koin.dsl.module
import ru.sylas.androidsqldelightapp.data.repository.DBRepositoryImpl
import ru.sylas.androidsqldelightapp.domain.repository.DBRepository
import ru.sylas.androidsqldelightapp.domain.usecase.GetFromDBUseCase
import ru.sylas.androidsqldelightapp.domain.usecase.SaveInDBUseCase

val domainModule = module {
    single<DBRepository>{ DBRepositoryImpl(get())}

    factory {
        GetFromDBUseCase(get())
    }
    factory {
        SaveInDBUseCase(get())
    }
}