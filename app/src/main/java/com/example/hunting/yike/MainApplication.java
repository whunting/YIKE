package com.example.hunting.yike;

import android.app.Application;
import android.content.res.Configuration;

/**
 * Created by hunting on 2018/2/11.
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
