package com.varol.boynews.remote

import com.varol.boynews.data.models.NewsModel
import com.varol.boynews.data.models.SourceModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("v2/sources")
    fun getSources(
        @Query(value = "apiKey") apiKey: String
    ): Single<BaseSourceResponse<MutableList<SourceModel>>>

    @GET("v2/top-headlines")
    fun getTopHeadLines(
        @Query(value = "apiKey") apiKey: String,
        @Query(value = "sources") sources: String
    ): Single<BaseNewsResponse<MutableList<NewsModel>>>


    @GET("v2/top-headlines")
    fun getSearchedNews(
        @Query(value = "apiKey") apiKey: String,
        @Query(value = "q") searchText: String
    ): Single<BaseNewsResponse<MutableList<NewsModel>>>


}