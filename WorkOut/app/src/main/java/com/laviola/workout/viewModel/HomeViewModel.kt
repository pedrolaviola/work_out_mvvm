package com.laviola.workout.viewModel

import android.databinding.ObservableField
import com.laviola.workout.base.BaseViewModel

class HomeViewModel : BaseViewModel(){
    val stringObservableField  = ObservableField<String>()
    init {
        stringObservableField.set("Teste")
    }
}