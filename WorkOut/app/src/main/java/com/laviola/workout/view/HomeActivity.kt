package com.laviola.workout.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.laviola.workout.R
import com.laviola.workout.base.BaseActivity
import com.laviola.workout.databinding.ActivityHomeBinding
import com.laviola.workout.viewModel.HomeViewModel

class HomeActivity : BaseActivity<ActivityHomeBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        mViewBinding.viewModel = HomeViewModel()
    }
}
