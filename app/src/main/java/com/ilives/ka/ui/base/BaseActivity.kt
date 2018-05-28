package com.ilives.ka.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ilives.ka.di.Injectable
import dagger.android.AndroidInjection



abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        if(this is Injectable){
            AndroidInjection.inject(this)
        }
        super.onCreate(savedInstanceState)
    }
}