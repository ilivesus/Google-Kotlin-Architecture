package com.ilives.ka.ui.user

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingComponent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ilives.ka.AppExecutors
import com.ilives.ka.R
import com.ilives.ka.binding.FragmentDataBindingComponent
import com.ilives.ka.databinding.UserFragmentBinding
import com.ilives.ka.di.Injectable
import com.ilives.ka.ui.common.RetryCallback
import com.ilives.ka.util.autoCleared
import javax.inject.Inject

/**
 * -------------^_^-------------
 * ❖ com.ilives.ka.ui.user
 * ❖ Created by IntelliJ IDEA
 * ❖ Author: Johnny
 * ❖ Date: 5/28/18
 * ❖ Time: 11:32
 * -------------^_^-------------
 **/
class UserFragment: Fragment(), Injectable {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject
    lateinit var appExecutors: AppExecutors

    var binding by autoCleared<UserFragmentBinding>()
    var dataBindingComponent: DataBindingComponent = FragmentDataBindingComponent(this)

    private lateinit var userViewModel: UserViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val dataBinding = DataBindingUtil.inflate<UserFragmentBinding>(
                inflater,
                R.layout.user_fragment,
                container,
                false,
                dataBindingComponent
        )
        binding = dataBinding
        return dataBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        userViewModel = ViewModelProviders.of(this, viewModelFactory)
                .get(UserViewModel::class.java)
    }
}