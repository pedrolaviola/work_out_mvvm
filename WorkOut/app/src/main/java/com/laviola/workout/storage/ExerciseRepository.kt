package com.laviola.workout.storage

import android.arch.persistence.room.Room
import android.content.Context
import com.laviola.workout.app.MyApplication
import com.laviola.workout.model.Exercise


class ExerciseRepository {
    var db = Room.databaseBuilder(getApplicationContext(),
            AppDatabase::class.java, "database-name").allowMainThreadQueries().build()

    private fun getApplicationContext(): Context {
        return MyApplication.instance
    }

    fun getAllExercises(): Array<Exercise> {
        return db.userDao().getAllExercises()
    }

    fun addExercise(array: Array<Exercise>){
        db.userDao().addExercises(array)
    }
}