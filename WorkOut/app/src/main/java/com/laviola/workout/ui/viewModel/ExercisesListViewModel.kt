package com.laviola.workout.ui.viewModel

import android.arch.lifecycle.ViewModel
import com.laviola.workout.model.Exercise
import com.laviola.workout.ui.item.ExerciseItem
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import io.reactivex.subjects.PublishSubject

class ExercisesListViewModel : ViewModel() {
    val adapter: GroupAdapter<ViewHolder> = GroupAdapter()
    val addExerciseClicked: PublishSubject<Void> = PublishSubject.create()

    init {
        showExercises(arrayOf(
                Exercise(name = "Nome", series = "3", repeat = "15", machine = "100"),
                Exercise(name = "Nome2", series = "4", repeat = "15", machine = "100"),
                Exercise(name = "Nome3", series = "5", repeat = "15", machine = "100"),
                Exercise(name = "Nome5", series = "7", repeat = "15", machine = "100")))
    }

    private fun showExercises(arrayOf: Array<Exercise>) {
        for (exercise in arrayOf) {
            adapter.add(ExerciseItem(exercise))
        }
    }

    fun addExercise() {
        addExerciseClicked.onComplete()
    }
}
