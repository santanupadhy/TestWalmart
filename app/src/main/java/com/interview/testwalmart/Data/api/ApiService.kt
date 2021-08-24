package com.interview.testwalmart.Data.api

import com.interview.testwalmart.Data.Model.GetNewsList
import io.reactivex.Single
import retrofit2.http.*

interface ApiService {

    @GET("/v2/top-headliness")
    fun getNewsList(@QueryMap body: Map<String?, String?>?): Single<GetNewsList>?

}
