package com.laviola.workout.ui.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.laviola.workout.R
import com.laviola.workout.base.BaseFragment
import com.laviola.workout.databinding.ExercicesListFragmentBinding
import com.laviola.workout.ui.viewModel.ExercisesListViewModel
import io.reactivex.internal.subscriptions.ArrayCompositeSubscription
import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription

class ExercisesListFragment : BaseFragment<ExercicesListFragmentBinding>() {
    companion object {
        fun newInstance() = ExercisesListFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.exercices_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewBinding = DataBindingUtil
                .setContentView(requireActivity(), R.layout.exercices_list_fragment)
        mViewBinding.viewModel =
                ViewModelProviders.of(this).get(ExercisesListViewModel::class.java)

    }
}
