package com.laviola.workout.ui.item

import com.laviola.workout.R
import com.laviola.workout.model.Exercise
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_exercise.*

class ExerciseItem(private val exercise: Exercise) : Item() {

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.title.text = exercise.name
        viewHolder.repeats.text = exercise.repeat
        viewHolder.series.text = exercise.series
        viewHolder.machine.text = exercise.machine
    }

    override fun getLayout(): Int {
        return R.layout.item_exercise//To change body of created functions use File | Settings | File Templates.
    }
}