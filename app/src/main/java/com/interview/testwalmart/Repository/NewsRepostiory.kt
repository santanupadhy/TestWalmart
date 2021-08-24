package com.interview.testwalmart.Repository

import com.interview.testwalmart.Data.Model.GetNewsList
import io.reactivex.Single
import retrofit2.http.QueryMap

interface NewsRepostiory {


    fun getNewsList(@QueryMap body: Map<String, String>): Single<GetNewsList>

}