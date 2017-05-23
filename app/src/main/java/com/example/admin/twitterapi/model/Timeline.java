package com.example.admin.twitterapi.model;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.admin.twitterapi.R;
import com.example.admin.twitterapi.activity.MainActivity;

public class Timeline extends AppCompatActivity {

    private String content;
    private Tweet tweet;
    private List<Tweet> tweets = new ArrayList<>();
    ListView timelineListView;

    public Timeline() {
    }

    public void jsonReader(Context context) {
        try {
            content = new Scanner(context.getAssets().open("output.json")).useDelimiter("\\Z").next();
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    public List<Tweet> jsonParser(Context context) {

        try {
            JSONObject jObj = new JSONObject(content);
            JSONArray jArr = jObj.getJSONArray("statuses");
            for (int i = 0; i < jArr.length(); i++) {
                JSONObject obj = jArr.getJSONObject(i);
                String text = obj.getString("text");
                String id_str = obj.getString("id_str");
                Tweet tweet = new Tweet(text, id_str);
                tweets.add(tweet);
            }
        } catch (JSONException ex) {
            ex.printStackTrace();
        }



        return tweets;

    }
}