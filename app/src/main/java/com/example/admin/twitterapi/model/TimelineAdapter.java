package com.example.admin.twitterapi.model;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.admin.twitterapi.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joey on 23/05/2017.
 */

public class TimelineAdapter extends ArrayAdapter<Tweet> {
    private ArrayList<Tweet> tweets;

    public TimelineAdapter(Context context, int resource,ArrayList<Tweet> objects) {
        super(context, resource , objects);
        tweets = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cell, parent, false);
        }

        Tweet tweet = tweets.get(position);

        TextView nameText = (TextView) convertView.findViewById(R.id.name);
        nameText.setText(tweet.getText());

        return convertView;
    }
}
