package com.example.dutest.dutest;

import android.app.Application;
import com.squareup.leakcanary.*;
import android.support.v7.app.AppCompatActivity;

//import com.squareup.leakcanary.RefWatcher;

public class ExampleApplication extends Application {

    private RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        // 安装方法1
//        LeakCanary.install(this);
        refWatcher = installLeakCanary();


    }


    protected RefWatcher installLeakCanary() {
        return RefWatcher.DISABLED;
    }

}
