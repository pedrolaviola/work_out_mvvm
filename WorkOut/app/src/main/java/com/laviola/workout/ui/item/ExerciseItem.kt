package com.laviola.workout.ui.item

import com.laviola.workout.R
import com.laviola.workout.databinding.ItemExerciseBinding
import com.laviola.workout.model.Exercise
import com.xwray.groupie.databinding.BindableItem

class ExerciseItem(private val exercise: Exercise) : BindableItem<ItemExerciseBinding>() {

    override fun getLayout(): Int {
        return R.layout.item_exercise
    }

    override fun bind(viewBinding: ItemExerciseBinding, position: Int) {
        viewBinding.exercise = exercise
    }
}