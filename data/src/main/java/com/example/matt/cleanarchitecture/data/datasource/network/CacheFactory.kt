package com.example.matt.cleanarchitecture.data.datasource.network

import okhttp3.Cache
import java.io.File

abstract class CacheFactory {

    companion object {
        private const val CACHE_SIZE: Long = 10 * 1024 * 1024

        fun createCache(cacheFile: File): Cache {
            return Cache(cacheFile, CACHE_SIZE)
        }
    }
}
