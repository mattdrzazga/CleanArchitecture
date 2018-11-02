package com.example.matt.cleanarchitecture.di

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.example.matt.cleanarchitecture.App
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class AppModule {

    @Binds
    abstract fun bindContext(app: App): Context

    @Module
    companion object {

        @Provides
        @JvmStatic
        fun provideSharedPreferences(app: Context): SharedPreferences {
            return PreferenceManager.getDefaultSharedPreferences(app)
        }
    }
}

