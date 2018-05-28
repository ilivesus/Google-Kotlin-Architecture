package com.ilives.ka.ui.base

import android.os.Bundle
import android.support.v4.app.Fragment
import com.ilives.ka.di.Injectable
import dagger.android.support.AndroidSupportInjection


abstract class BaseFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        if (this is Injectable) {
            AndroidSupportInjection.inject(this)
        }
        super.onCreate(savedInstanceState)
    }
}
