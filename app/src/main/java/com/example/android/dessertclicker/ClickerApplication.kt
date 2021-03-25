package com.example.android.dessertclicker

import android.app.Application
import timber.log.Timber

class ClickerApplicationn : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

}