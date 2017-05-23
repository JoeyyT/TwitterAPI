package com.example.admin.twitterapi.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.admin.twitterapi.R;
import com.example.admin.twitterapi.model.Timeline;
import com.example.admin.twitterapi.model.TimelineAdapter;
import com.example.admin.twitterapi.model.TimelineSingleton;

public class MainActivity extends AppCompatActivity {

    // Declare variables
    Timeline timeline;
    static public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Select layout file
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        // Get Singleton instances
        timeline = TimelineSingleton.getOurInstance().getTimeline();

        // Run JSONREADER && JSONPARSER
        timeline.jsonReader(this);
        TimelineAdapter arrayAdapter = new TimelineAdapter(context, R.layout.cell, timeline.jsonParser(this));
        ListView timelineListView = (ListView) findViewById(R.id.timelineListView);
        timelineListView.setAdapter(arrayAdapter);

    }
}
