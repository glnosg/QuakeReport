package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by pawel on 22.10.17.
 */

public class EarthquakeAdapter extends ArrayAdapter {

    private static final String LOCATION_SEPARATOR = " of ";

    /**
     * @param context - Current context
     * @param objects - List of object represented in ListView
     */
    public EarthquakeAdapter(Context context, ArrayList objects) {
        super(context, -1, objects);
    }

    /**
     *
     * @param position - position of the item
     * @param convertView - old view to reuse when possible
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View myView = convertView;

        if (myView == null) {
            myView = LayoutInflater.from(getContext()).inflate(R.layout.earthquakes_list_item, parent, false);
        }

        final Earthquake currentEarthquake = (Earthquake) getItem(position);

        TextView magnitudeTextView = (TextView) myView.findViewById(R.id.magnitude_text_view);
        DecimalFormat decimalFormatter = new DecimalFormat(getContext().getString(R.string.decimal_format));
        magnitudeTextView.setText(decimalFormatter.format(currentEarthquake.getMagnitude()));

        String[] locationData = prepareLocationStrings(currentEarthquake.getPlace());

        TextView locationPrimaryTextView = (TextView) myView.findViewById(R.id.location_primary_text_view);
        locationPrimaryTextView.setText(locationData[0]);

        TextView locationOffsetTextView = (TextView) myView.findViewById(R.id.location_offset_text_view);
        locationOffsetTextView.setText(locationData[1]);

        TextView dateTextView = (TextView) myView.findViewById(R.id.date_text_view);
        DateFormat dateFormatter = new SimpleDateFormat("MMM d, yyyy");
        dateTextView.setText(dateFormatter.format(new Date(currentEarthquake.getTimeInMilliseconds())));

        TextView timeTextView = (TextView) myView.findViewById(R.id.time_text_view);
        DateFormat tdf = new SimpleDateFormat("h:mm a");
        timeTextView.setText(tdf.format(new Date(currentEarthquake.getTimeInMilliseconds())));

        return myView;
    }

    String[] prepareLocationStrings(String location) {
        String[] locationStrings = new String[2];

        if (location.contains(LOCATION_SEPARATOR)) {
            locationStrings = location.split(LOCATION_SEPARATOR);
            locationStrings[0] += " of";
        } else {
            locationStrings[0] = getContext().getString(R.string.near_the);
            locationStrings[1] = location;
        }

        return locationStrings;
    }
}
