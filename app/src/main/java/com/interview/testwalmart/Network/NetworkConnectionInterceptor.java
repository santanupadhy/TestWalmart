package com.interview.testwalmart.Network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.interview.testwalmart.App;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class NetworkConnectionInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        if (!isConnected()) {
            throw new NoConnectivityException();
            // Throwing our custom exception 'NoConnectivityException'
        }
        Request.Builder builder = chain.request().newBuilder();
        return chain.proceed(builder.build());
    }
    public boolean isConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) App.getAppInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = connectivityManager.getActiveNetworkInfo();
        return (netInfo != null && netInfo.isConnected());
    }

}