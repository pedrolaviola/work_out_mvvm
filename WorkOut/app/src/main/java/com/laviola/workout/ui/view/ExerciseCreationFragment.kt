package com.laviola.workout.ui.view

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.laviola.workout.R
import com.laviola.workout.model.Exercise
import com.laviola.workout.ui.viewModel.ExerciseCreationViewModel
import kotlinx.android.synthetic.main.exercise_creation_fragment.*



class ExerciseCreationFragment : Fragment() {

    companion object {
        fun newInstance() = ExerciseCreationFragment()
    }

    private lateinit var viewModel: ExerciseCreationViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.exercise_creation_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ExerciseCreationViewModel::class.java)
        setListeners()
    }

    private fun setListeners() {
        btnCreate.setOnClickListener {
            if (verifyFields())
                viewModel.addExercise(Exercise(name = nameEdt.text.toString(),
                        series = seriesEdt.text.toString(),
                        repeat = repeatsEdt.text.toString(),
                        machine = machine.text.toString()))
            else
            Snackbar.make(createFragmentContainer,
                    getString(R.string.empty_fields), Snackbar.LENGTH_SHORT)
        }
    }

    private fun verifyFields(): Boolean {
        return !TextUtils.isEmpty(nameEdt.text) &&
                !TextUtils.isEmpty(seriesEdt.text) &&
                !TextUtils.isEmpty(repeatsEdt.text) &&
                !TextUtils.isEmpty(machine.text)
    }

}


