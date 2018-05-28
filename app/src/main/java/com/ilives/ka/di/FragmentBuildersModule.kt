package com.ilives.ka.di

import com.ilives.ka.ui.user.UserFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * -------------^_^-------------
 * ❖ com.ilives.ka.di
 * ❖ Created by IntelliJ IDEA
 * ❖ Author: Johnny
 * ❖ Date: 5/28/18
 * ❖ Time: 11:25
 * -------------^_^-------------
 **/
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeUserFragment(): UserFragment
}