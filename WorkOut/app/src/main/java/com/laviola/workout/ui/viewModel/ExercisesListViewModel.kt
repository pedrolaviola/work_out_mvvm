package com.laviola.workout.ui.viewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.laviola.workout.data.Response
import com.laviola.workout.data.Status
import com.laviola.workout.model.Exercise
import com.laviola.workout.storage.ExerciseRepository

class ExercisesListViewModel : ViewModel() {
    val exercises: MutableLiveData<Response<Array<Exercise>>> = MutableLiveData()
    private val repository = ExerciseRepository()

    init {
        addExercise()
        addExercise()
        val exerciseList = repository.getAllExercises()
        exercises.value = Response(Status.SUCCESS, exerciseList, null)
    }

    private fun addExercise() {
        repository.addExercise(arrayOf(Exercise(name = "Nome",
                repeat = "10",
                series = "3",
                machine = "30")))
    }
}
