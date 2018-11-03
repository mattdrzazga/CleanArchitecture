package com.example.matt.cleanarchitecture.data.feature.comment

import com.example.matt.cleanarchitecture.data.feature.comment.datasource.local.CommentEntity
import io.reactivex.Observable

interface CommentStore {
    fun getComments(): Observable<List<CommentEntity>>
}
