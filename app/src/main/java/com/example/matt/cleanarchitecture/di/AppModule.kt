package com.example.matt.cleanarchitecture.di

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.example.matt.cleanarchitecture.App
import com.example.matt.cleanarchitecture.BuildConfig
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class AppModule {

    @Binds
    abstract fun bindContext(app: App): Context

    @Module
    companion object {
        const val IS_DEBUG = "isDebug"

        @Provides
        @JvmStatic
        fun provideSharedPreferences(app: Context): SharedPreferences {
            return PreferenceManager.getDefaultSharedPreferences(app)
        }

        @Provides
        @Named(IS_DEBUG)
        fun provideIsDebug() = BuildConfig.DEBUG
    }
}

