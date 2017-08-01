package com.example.john.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    private static final String TAG = "DisplayMessageActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

// Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(message);

    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "on start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "on start");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "on destroy");
    }
}
