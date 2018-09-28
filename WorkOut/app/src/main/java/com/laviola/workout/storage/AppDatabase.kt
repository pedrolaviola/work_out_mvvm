package com.laviola.workout.storage

import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.Database
import com.laviola.workout.model.Exercise


@Database(entities = [Exercise::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): ExerciseDao
}