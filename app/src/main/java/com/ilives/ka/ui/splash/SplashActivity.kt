package com.ilives.ka.ui.splash

import android.arch.lifecycle.ViewModelProvider
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ilives.ka.R
import com.ilives.ka.databinding.ActivitySplashBinding
import javax.inject.Inject

/**
 * -------------^_^-------------
 * ❖ com.ilives.ka.ui.common
 * ❖ Created by IntelliJ IDEA
 * ❖ Author: Johnny
 * ❖ Date: 5/28/18
 * ❖ Time: 15:35
 * -------------^_^-------------
 **/
class SplashActivity: AppCompatActivity() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView(this, R.layout.activity_splash) as ActivitySplashBinding
    }
}