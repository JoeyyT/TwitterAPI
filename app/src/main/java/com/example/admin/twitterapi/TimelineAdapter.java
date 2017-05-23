package com.example.admin.twitterapi;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.admin.twitterapi.R;
import com.example.admin.twitterapi.model.Tweet;

import java.util.List;

/**
 * Created by Joey on 23/05/2017.
 */

public class TimelineAdapter extends ArrayAdapter<Tweet> {
    private List<Tweet> tweets;

    public TimelineAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Tweet> objects) {
        super(context, resource , objects);
        tweets = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cell, parent, false);
        }

        Tweet tweet = tweets.get(position);

        TextView nameText = (TextView) convertView.findViewById(R.id.name);
        nameText.setText(tweet.getText());

        return convertView;
    }
}
