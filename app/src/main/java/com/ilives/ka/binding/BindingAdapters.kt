package com.ilives.ka.binding

import android.databinding.BindingAdapter
import android.view.View

/**
 * -------------^_^-------------
 * ❖ com.ilives.ka.binding
 * ❖ Created by IntelliJ IDEA
 * ❖ Author: Johnny
 * ❖ Date: 5/28/18
 * ❖ Time: 09:42
 * -------------^_^-------------
 **/
object BindingAdapters {
    @JvmStatic
    @BindingAdapter("visibleGone")
    fun showHide(view: View, show: Boolean) {
        view.visibility = if (show) View.VISIBLE else View.GONE
    }
}