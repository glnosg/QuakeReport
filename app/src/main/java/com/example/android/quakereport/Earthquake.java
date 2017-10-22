package com.example.android.quakereport;

/**
 * Created by pawel on 22.10.17.
 */

public class Earthquake {

    private float mMagnitude;
    private long mDate;
    private String mPlace;

    /**
     *
     * @param mag - Magnitude of earthquake
     * @param date - When earthquake occurred
     * @param place - Where earthquake occurred
     */
    public Earthquake (float mag, long date, String place) {
        mMagnitude = mag;
        mDate = date;
        mPlace = place;
    }

    public float getMagnitude() {
        return mMagnitude;
    }

    public long getDate() {
        return mDate;
    }

    public String getPlace() {
        return mPlace;
    }
}
