package com.laviola.workout.ui.viewModel

import android.arch.lifecycle.ViewModel;
import com.laviola.workout.model.Exercise
import com.laviola.workout.storage.ExerciseRepository

class ExerciseCreationViewModel : ViewModel() {
    private val repository = configureRepository()

    fun addExercise(exercise: Exercise) {
        val exerciseArray = repository.getAllExercises()
        exerciseArray.add(exercise)
        repository.addExercise(exerciseArray)
    }

    private fun configureRepository(): ExerciseRepository {
        return ExerciseRepository()
    }
}
