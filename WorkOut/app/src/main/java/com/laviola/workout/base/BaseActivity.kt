package com.laviola.workout.base

import android.annotation.SuppressLint
import android.databinding.ViewDataBinding
import android.support.v7.app.AppCompatActivity

@SuppressLint("Registered")
open class BaseActivity<T : ViewDataBinding> : AppCompatActivity(){

    protected lateinit var mViewBinding : T
}