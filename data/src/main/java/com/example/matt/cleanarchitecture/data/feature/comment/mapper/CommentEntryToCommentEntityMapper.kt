package com.example.matt.cleanarchitecture.data.feature.comment.mapper

import com.example.matt.cleanarchitecture.data.feature.comment.datasource.local.CommentEntity
import com.example.matt.cleanarchitecture.data.feature.comment.datasource.network.CommentEntry
import com.example.matt.cleanarchitecture.data.mapper.Mapper
import javax.inject.Inject

class CommentEntryToCommentEntityMapper @Inject constructor() : Mapper<CommentEntry, CommentEntity>() {

    override fun transform(obj: CommentEntry?): CommentEntity? {
        if (obj == null) return null
        return with(obj) {
            CommentEntity(id, postId, name, email, body)
        }
    }
}
