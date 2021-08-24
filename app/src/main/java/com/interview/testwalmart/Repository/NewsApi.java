package com.interview.testwalmart.Repository;

import com.interview.testwalmart.Data.Model.GetNewsList;
import com.interview.testwalmart.Data.api.ApiService;
import com.interview.testwalmart.Network.RetrofitUtils;

import java.util.Map;

import io.reactivex.Single;
import retrofit2.http.QueryMap;

public class NewsApi {

    private ApiService apiService = RetrofitUtils.getRetrofit().create(ApiService.class);

    public Single<GetNewsList> getNewsList(@QueryMap Map<String, String> body) {

        return apiService.getNewsList(body);
    }
}
