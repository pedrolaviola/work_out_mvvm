package com.laviola.workout

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.laviola.workout.app.RealmRepository
import com.laviola.workout.data.Response
import com.laviola.workout.data.Status

class ExercisesListViewModel : ViewModel() {
    private val  realmRepository = RealmRepository()
    val exercises: MutableLiveData<Response<Array<Exercise>>> = MutableLiveData()

    init {
        addExercise()
        addExercise()
        val exercisesList = realmRepository.getAllExercises()
        exercises.value = Response(Status.SUCCESS, exercisesList, null)
    }

    fun addExercise(){
        realmRepository.addExercises(Exercise(name = "nome",
                series = "10",
                machine = "10",
                repeat = "10"))
    }
}
