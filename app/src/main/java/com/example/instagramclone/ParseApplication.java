package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Register your parse moedls
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VEMD0uKMPpDYEDJiPjPlb5k4JysyydTHfAQH0V2A")
                .clientKey("CVO1XzMAHhqLGil2smuAIkkokmxzODKdSPSaA7rQ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
