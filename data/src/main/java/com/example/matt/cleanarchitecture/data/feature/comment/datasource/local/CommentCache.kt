package com.example.matt.cleanarchitecture.data.feature.comment.datasource.local

import com.example.matt.cleanarchitecture.data.feature.comment.CommentStore

interface CommentCache : CommentStore {
    fun saveComments(comments: List<CommentEntity>)
}
