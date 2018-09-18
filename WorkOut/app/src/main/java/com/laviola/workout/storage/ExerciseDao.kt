package com.laviola.workout.storage

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.laviola.workout.model.Exercise

@Dao
interface ExerciseDao {

    @Query("Select * FROM exercise")
    fun getAllExercises(): Array<Exercise>

    @Insert
    fun addExercises(array: Array<Exercise>)
}