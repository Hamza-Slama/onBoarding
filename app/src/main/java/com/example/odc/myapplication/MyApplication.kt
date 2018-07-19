package com.example.odc.myapplication

import android.app.Application

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        SharedPrefsManager.create(this)
    }
}