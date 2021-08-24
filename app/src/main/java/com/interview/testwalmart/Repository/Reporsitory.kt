package com.interview.testwalmart.Repository

import com.interview.testwalmart.Data.Model.GetNewsList
import io.reactivex.Single

class Reporsitory : NewsRepostiory {
    private val newsApi = NewsApi()

    override fun getNewsList(body: Map<String, String>): Single<GetNewsList> {
        return newsApi.getNewsList(body)
    }


}