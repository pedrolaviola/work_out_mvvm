package com.laviola.workout.base

import android.annotation.SuppressLint
import android.databinding.ViewDataBinding
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

@SuppressLint("Registered")
open class BaseFragment<T : ViewDataBinding> : Fragment(){

    protected lateinit var mViewBinding : T
}