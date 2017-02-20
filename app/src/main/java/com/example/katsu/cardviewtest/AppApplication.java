package com.example.katsu.cardviewtest;

import android.app.Application;

import com.example.katsu.cardviewtest.di.PresentationComponent;

/**
 * Created by katsu on 2017/02/21.
 */

public class AppApplication extends Application {
    private PresentationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }
    private void initializeInjector() {
    }
    public PresentationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
