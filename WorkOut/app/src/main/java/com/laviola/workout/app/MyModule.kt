package com.laviola.workout.app

import com.laviola.workout.Exercise
import io.realm.annotations.RealmModule

@RealmModule(classes = [Exercise::class])
class MyModule {
}