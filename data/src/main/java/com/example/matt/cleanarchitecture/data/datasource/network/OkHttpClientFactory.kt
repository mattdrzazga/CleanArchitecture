package com.example.matt.cleanarchitecture.data.datasource.network

import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

abstract class OkHttpClientFactory {

    companion object {
        fun createOkHttpClient(cache: Cache, isDebug: Boolean): OkHttpClient {
            return OkHttpClient.Builder()
                .cache(cache)
                .addInterceptor(HttpLoggingInterceptor().setLevel(getLoggingLevel(isDebug)))
                .build()
        }

        private fun getLoggingLevel(isDebug: Boolean): HttpLoggingInterceptor.Level {
            return when (isDebug) {
                true -> HttpLoggingInterceptor.Level.BODY
                false -> HttpLoggingInterceptor.Level.NONE
            }
        }
    }
}