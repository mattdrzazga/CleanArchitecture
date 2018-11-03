package com.example.matt.cleanarchitecture.data.datasource.network

import com.example.matt.cleanarchitecture.data.feature.comment.datasource.network.CommentEntry
import io.reactivex.Observable
import retrofit2.http.GET

interface RestApiService {

    @GET("comments")
    fun getComments(): Observable<List<CommentEntry>>
}
