package com.laviola.workout.app

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration



class MyApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        val config = RealmConfiguration.Builder()
                .name("workout.realm")
                .schemaVersion(0)
                .build()
        Realm.setDefaultConfiguration(config)
    }
}