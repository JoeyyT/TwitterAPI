package com.example.admin.twitterapi.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.twitterapi.R;
import com.example.admin.twitterapi.model.Timeline;
import com.example.admin.twitterapi.model.TimelineSingleton;

public class MainActivity extends AppCompatActivity {

    // Declare variables
    Timeline timeline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Select layout file
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get Singleton instances
        timeline = TimelineSingleton.getOurInstance().getTimeline();

        // Run JSONREADER && JSONPARSER
        timeline.jsonReader(this);
        timeline.jsonParser(this);
    }
}
