package com.shop.apps;

import android.app.Application;
import android.content.Context;

public class MyApp extends Application {

    public static Context myApp;

    @Override
    public void onCreate() {
        super.onCreate();
        myApp = this;
    }
}
