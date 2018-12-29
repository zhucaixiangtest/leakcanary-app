package com.example.dutest.dutest;


import com.squareup.leakcanary.*;

public class DebugExampleApplication extends ExampleApplication{
    @Override
    protected RefWatcher installLeakCanary() {
        // Build a customized RefWatcher
        RefWatcher refWatcher = LeakCanary.refWatcher(this)
                .listenerServiceClass(LeakUploadService.class)
                .buildAndInstall();
        return refWatcher;
    }
}
