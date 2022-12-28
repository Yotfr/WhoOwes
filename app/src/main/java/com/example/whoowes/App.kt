package com.example.whoowes

import android.app.Application
import com.example.whoowes.di.AppComponent
import com.example.whoowes.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}
