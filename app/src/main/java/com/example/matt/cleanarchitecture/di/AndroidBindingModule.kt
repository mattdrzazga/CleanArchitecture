package com.example.matt.cleanarchitecture.di

import com.example.matt.cleanarchitecture.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface AndroidBindingModule {
    @ContributesAndroidInjector
    fun mainActivity(): MainActivity
}
