package com.example.android.quakereport;

public class Earthquake {

    private double mEarthquakeMagnitude;

    private String mEarthquakeLocation;

    private long mEarthquakeTime;

    private String mUrl;

    public Earthquake(double magnitude, String location, long time, String url){
        mEarthquakeMagnitude = magnitude;
        mEarthquakeLocation = location;
        mEarthquakeTime = time;
        mUrl = url;
    }

    public double getEarthquakeMagnitude(){
        return mEarthquakeMagnitude;
    }

    public String getEarthquakeLocation(){
        return mEarthquakeLocation;
    }

    public long getEarthquakeTime(){
        return mEarthquakeTime;
    }

    public String getUrl(){
        return mUrl;
    }
}
