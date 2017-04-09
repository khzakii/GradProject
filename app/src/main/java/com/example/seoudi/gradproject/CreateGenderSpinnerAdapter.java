package com.example.seoudi.gradproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Host on 4/4/2017.
 */
public class CreateGenderSpinnerAdapter extends ArrayAdapter {
    private LayoutInflater inflater;
    private String[] values;
    private TextView textView;

    public CreateGenderSpinnerAdapter(Context context, int textViewResourceId,
                                     String[] objects) {
        super(context, textViewResourceId, objects);
        inflater = LayoutInflater.from(context);
        values = objects;

    }

    public View getCustomView(int position, View convertView,
                              ViewGroup parent) {

// Inflating the layout for the custom Spinner
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            convertView = inflater.inflate(R.layout.create_spinner_item, parent, false);

        }

        textView = (TextView) convertView.findViewById(R.id.sptext);
        textView.setText(values[position]);

        return convertView;
    }

    // It gets a View that displays in the drop down popup the data at the specified position
    @Override
    public View getDropDownView(int position, View convertView,
                                ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    // It gets a View that displays the data at the specified position
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }
}
