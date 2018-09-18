package com.laviola.workout

import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder

class ExerciseItem(private val exercise: Exercise) : Item<ViewHolder>() {
    override fun bind(viewHolder: ViewHolder, position: Int) {

    }

    override fun getLayout(): Int {
        return R.layout.item_exercise//To change body of created functions use File | Settings | File Templates.
    }
}