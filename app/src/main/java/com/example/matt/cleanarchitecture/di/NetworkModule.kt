package com.example.matt.cleanarchitecture.di

import com.example.matt.cleanarchitecture.App
import com.example.matt.cleanarchitecture.data.datasource.network.CacheFactory
import com.example.matt.cleanarchitecture.data.datasource.network.OkHttpClientFactory
import com.example.matt.cleanarchitecture.data.datasource.network.RetrofitFactory
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.Reusable
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.io.File
import javax.inject.Named
import javax.inject.Singleton

@Module
abstract class NetworkModule {

    @Module
    companion object {
        const val GSON = "gson"

        @Provides
        @Singleton
        fun provideCacheFile(app: App): File = app.cacheDir

        @Provides
        @Singleton
        fun provideCache(file: File) = CacheFactory.createCache(file)

        @Reusable
        @Provides
        @Named(GSON)
        fun provideGson(): Gson {
            return GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create()
        }

        @Provides
        @Singleton
        fun provideOkHttpClient(cache: Cache, @Named(AppModule.IS_DEBUG) isDebug: Boolean): OkHttpClient {
            return OkHttpClientFactory.createOkHttpClient(cache, isDebug)
        }

        @Provides
        @Singleton
        fun provideRetrofit(client: OkHttpClient, gson: Gson): Retrofit {
            return RetrofitFactory.provideRetrofit(client, gson)
        }
    }
}
