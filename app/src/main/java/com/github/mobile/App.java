package com.github.mobile;

import android.app.Application;
import android.content.Context;
import android.os.Build;

import com.manichord.mgit.transport.SSLProviderInstaller;

public class App extends Application {
    
    @Override
    public void onCreate() {
        super.onCreate();
        
        if (Build.VERSION.SDK_INT < 21) {
            SSLProviderInstaller.install(this);
        }
    }
}
