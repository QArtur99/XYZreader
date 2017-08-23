package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final String LOG_TAG = Config.class.getSimpleName();
    public static final String FIRST_URL = "https://go.udacity.com/xyz-reader-json";
    public static final String SECOND_URL = "https://raw.githubusercontent.com/TNTest/xyzreader/master/data.json";
    public static final URL BASE_URL;

    static {
        URL url = null;

        try {
            url = new URL(SECOND_URL);
        } catch (MalformedURLException e) {
            Log.e(LOG_TAG, e.getMessage(), e);
        }


        BASE_URL = url;
    }
}
