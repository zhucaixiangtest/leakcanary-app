package com.example.dutest.dutest;

import android.app.Application;
import com.squareup.leakcanary.LeakCanary;
import android.support.v7.app.AppCompatActivity;

//import com.squareup.leakcanary.RefWatcher;

public class ExampleApplication extends Application {

//    private RefWatcher mRefWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }

}
