package com.laviola.workout.storage

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.laviola.workout.model.Exercise

@Dao
interface ExerciseDao {

    @Query("Select * FROM exercise")
    fun getAllExercises(): MutableList<Exercise>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addExercises(array: MutableList<Exercise>)
}