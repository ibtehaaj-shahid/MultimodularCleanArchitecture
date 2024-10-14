package com.example.olxarchitecturedemov2

import android.app.Application
import com.example.di.usecase.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class OLXArchitectureApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@OLXArchitectureApp)
            modules(appModule)
        }
    }

}