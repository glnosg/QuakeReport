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
    public Earthquake (String mag, String place, String date) {
        mMagnitude = Float.parseFloat(mag);
        mPlace = place;
        mDate = Long.parseLong(date);
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
