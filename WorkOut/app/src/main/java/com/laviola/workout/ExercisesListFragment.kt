package com.laviola.workout

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.laviola.workout.data.Status
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.exercices_list_fragment.*

class ExercisesListFragment : Fragment() {
    private val adapter: GroupAdapter<ViewHolder> = GroupAdapter()
    private lateinit var viewModel: ExercisesListViewModel

    companion object {
        fun newInstance() = ExercisesListFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.exercices_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ExercisesListViewModel::class.java)
        exercisesList.adapter = adapter
        exercisesList.layoutManager = LinearLayoutManager(context)
        observeData()
    }

    private fun observeData() {
        viewModel.exercises.observe(this, Observer { response ->
            if (response?.status == Status.SUCCESS) {
                addExercises(response.data!!)
            }
        })
    }

    private fun addExercises(exercises: Array<Exercise>) {
        for (exercise in exercises) {
            adapter.add(ExerciseItem(exercise))
        }
    }
}
