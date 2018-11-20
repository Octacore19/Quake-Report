package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mtime;
    private String mUrl;

    public Earthquake(double magnitude, String location, long time, String url) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mtime = time;
        this.mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTime(){
        return mtime;
    }

    public String getUrl() { return mUrl; }
}
