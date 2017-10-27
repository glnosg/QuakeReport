package com.example.android.quakereport;

/**
 * Created by pawel on 22.10.17.
 */

public class Earthquake {

    private float mMagnitude;
    private long mTime;
    private String mPlace;

    /**
     *
     * @param mag - Magnitude of earthquake
     * @param time - When earthquake occurred
     * @param place - Where earthquake occurred
     */
    public Earthquake (String mag, String place, long time) {
        mMagnitude = Float.parseFloat(mag);
        mPlace = place;
        mTime = time;
    }

    public float getMagnitude() {
        return mMagnitude;
    }

    public long getTimeInMilliseconds() {
        return mTime;
    }

    public String getPlace() {
        return mPlace;
    }
}
