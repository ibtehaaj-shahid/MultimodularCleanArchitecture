package com.example.multimodularcleanarchitecture

import android.app.Application
import com.example.di.usecase.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MultimodularCleanArchitecture: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MultimodularCleanArchitecture)
            modules(appModule)
        }
    }

}