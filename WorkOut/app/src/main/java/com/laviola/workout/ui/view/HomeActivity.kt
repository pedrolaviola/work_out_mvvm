package com.laviola.workout.ui.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.laviola.workout.R
import com.microsoft.appcenter.crashes.Crashes
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.AppCenter



class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val host = supportFragmentManager.findFragmentById(R.id.myFragment) as NavHostFragment
        AppCenter.start(application, "5533610d-5365-42a6-8748-3061057520de",
                Analytics::class.java, Crashes::class.java)
        val navController = host.navController
        NavigationUI.setupActionBarWithNavController(this, navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.myFragment).navigateUp()
    }

}
