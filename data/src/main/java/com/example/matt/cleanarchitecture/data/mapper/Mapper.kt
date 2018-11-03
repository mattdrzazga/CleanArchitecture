package com.example.matt.cleanarchitecture.data.mapper

abstract class Mapper<F, T> {

    abstract fun transform(obj: F?): T

    fun reverse(obj: T?): F {
        TODO()
    }

    fun transform(list: List<F>?): List<T> {
        return list?.map(this::transform) ?: emptyList()
    }

    fun reverse(list: List<T>?): List<F> {
        return list?.map(this::reverse) ?: emptyList();
    }
}
