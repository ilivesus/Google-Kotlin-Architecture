package com.ilives.ka.binding

import android.databinding.DataBindingComponent
import android.support.v4.app.Fragment

/**
 * -------------^_^-------------
 * ❖ com.ilives.ka.binding
 * ❖ Created by IntelliJ IDEA
 * ❖ Author: Johnny
 * ❖ Date: 5/28/18
 * ❖ Time: 09:58
 * -------------^_^-------------
 **/
class FragmentDataBindingComponent(fragment: Fragment): DataBindingComponent{
    private val adapter = FragmentBindingAdapters(fragment)

    override fun getFragmentBindingAdapters() = adapter
}