package com.interview.testwalmart;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;



public class App extends Application {


    protected static App instance;
   public static App get() {
        return instance;
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;


    }

    public static App getAppInstance() {
        return instance;
    }

}
