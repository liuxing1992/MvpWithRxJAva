package com.tubban.myrxmvpwithcache.application;

import android.app.Application;
import android.content.Context;

/**
 * Created by liu_yao on 2016/12/7.
 */

public class CoreApp extends Application {

    private static CoreApp mApp;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
    }

    public static synchronized CoreApp getInstance() {
        return mApp;
    }

    public static Context getAppContext() {
        return mApp.getApplicationContext();
    }
    public String setBaseUrl() {
        return "http://api.dantangapp.com/";
    }

}
