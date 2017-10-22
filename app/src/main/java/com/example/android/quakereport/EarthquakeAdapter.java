package com.example.android.quakereport;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.IntegerRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TableLayout;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by pawel on 22.10.17.
 */

public class EarthquakeAdapter extends ArrayAdapter {

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
        magnitudeTextView.setText(Float.toString(currentEarthquake.getMagnitude()));

        TextView placeTextView = (TextView) myView.findViewById(R.id.place_text_view);
        placeTextView.setText(currentEarthquake.getPlace());

        TextView dateTextView = (TextView) myView.findViewById(R.id.date_text_view);
        DateFormat df = new SimpleDateFormat("MMM d, yyyy");
        dateTextView.setText(df.format(new Date(currentEarthquake.getDate())));

        return myView;
    }
}
