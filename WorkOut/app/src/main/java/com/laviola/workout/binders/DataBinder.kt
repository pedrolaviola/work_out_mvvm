package com.laviola.workout.binders

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import android.view.View
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder

class DataBinder {

    @BindingAdapter("app:adapter")
    fun setAdapter(list: RecyclerView, adapter: GroupAdapter<ViewHolder>) {
        list.adapter = adapter
    }

    @BindingAdapter("app:layoutManager")
    fun setLayoutManager(list: RecyclerView, layoutManager: RecyclerView.LayoutManager) {
        list.layoutManager = layoutManager
    }

    @BindingAdapter("app:visibility")
    fun setVisibility(view: View, boolean: Boolean) {
        view.visibility = if (boolean) View.VISIBLE else View.GONE
    }
}