package com.example.matt.cleanarchitecture.data.feature.comment.datasource.local

data class CommentEntity(val id: Int, val postId: Int, val name: String, val email: String, val body: String)
