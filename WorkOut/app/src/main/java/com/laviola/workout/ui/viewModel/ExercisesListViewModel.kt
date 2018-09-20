package com.laviola.workout.ui.viewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.laviola.workout.data.Response
import com.laviola.workout.data.Status
import com.laviola.workout.model.Exercise
import com.laviola.workout.storage.ExerciseRepository

class ExercisesListViewModel : ViewModel() {
    val exercises = MutableLiveData<Response<MutableList<Exercise>>>()
    private val repository = ExerciseRepository()

    init {
        val exerciseList = repository.getAllExercises()
        exercises.value = Response(Status.SUCCESS, exerciseList, null)
    }
}
