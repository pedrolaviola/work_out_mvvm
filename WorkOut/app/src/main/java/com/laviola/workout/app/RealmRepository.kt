package com.laviola.workout.app

import com.laviola.workout.Exercise
import io.realm.Realm
import io.realm.RealmResults


class RealmRepository {
    private val realm = Realm.getDefaultInstance()
    fun getAllExercises(): Array<Exercise> {
        val exerciseResult: RealmResults<Exercise> = realm.where(Exercise::class.java).findAll()
        return exerciseResult.toTypedArray()
    }

    fun addExercises(exercise: Exercise) {
        realm.executeTransaction {
            val nextInt = realm.where(Exercise::class.java).count() + 1
            val e = realm.createObject(Exercise::class.java, nextInt)
            e.repeat = exercise.repeat
            e.name = exercise.name
            e.machine = exercise.machine
            e.series = exercise.series
        }
    }
}