package com.example.android.quakereport;

/**
 * Created by pawel on 22.10.17.
 */

public class Earthquake {

    private double mMagnitude;
    private long mTime;
    private String mPlace;

    /**
     *
     * @param mag - Magnitude of earthquake
     * @param time - When earthquake occurred
     * @param place - Where earthquake occurred
     */
    public Earthquake (double mag, String place, long time) {
        mMagnitude = mag;
        mPlace = place;
        mTime = time;
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
}
