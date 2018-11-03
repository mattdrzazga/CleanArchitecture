package com.example.matt.cleanarchitecture.data.feature.comment.datasource.network

import com.example.matt.cleanarchitecture.data.datasource.network.RestApiService
import com.example.matt.cleanarchitecture.data.feature.comment.CommentStore
import com.example.matt.cleanarchitecture.data.feature.comment.datasource.local.CommentCache
import com.example.matt.cleanarchitecture.data.feature.comment.datasource.local.CommentEntity
import com.example.matt.cleanarchitecture.data.feature.comment.mapper.CommentEntryToCommentEntityMapper
import io.reactivex.Observable
import javax.inject.Inject

class CommentNetworkStore @Inject constructor(
    private val api: RestApiService,
    private val mapper: CommentEntryToCommentEntityMapper,
    private val cache: CommentCache
) : CommentStore {

    override fun getComments(): Observable<List<CommentEntity>> {
        return api.getComments()
            .map(mapper::transform)
            .doOnNext(cache::saveComments)
    }
}
