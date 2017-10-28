package com.example.android.quakereport;

/**
 * Created by pawel on 22.10.17.
 */

public class Earthquake {

    private double mMagnitude;
    private long mTime;
    private String mPlace;
    private String mUrl;

    /**
     * @param mag - Magnitude of earthquake
     * @param time - When earthquake occurred
     * @param place - Where earthquake occurred
     * @param url - URL to earthquake details
     */
    public Earthquake (double mag, String place, long time, String url) {
        mMagnitude = mag;
        mPlace = place;
        mTime = time;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public long getTimeInMilliseconds() {
        return mTime;
    }

    public String getPlace() {
        return mPlace;
    }

    public String getURL() {
        return mUrl;
    }
}
